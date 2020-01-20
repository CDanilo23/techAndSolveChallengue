package com.techandsolve.app.models.service;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techandsolve.app.models.dao.VueloDao;
import com.techandsolve.app.models.entity.Vuelo;
import com.techandsolve.app.transfer.VueloDto;

@Service
public class VueloServiceImpl implements VueloService{
	
	LocalTime morning = LocalTime.of(12, 00 ,00);

	@Autowired
	private VueloDao vueloDao;
	
	@Transactional(readOnly = true)
	public List<VueloDto> findAll(){
		
		List<VueloDto> dtos = new ArrayList<>();
		vueloDao.findAll().forEach(vuelo -> {
			Instant instant = vuelo.getFechaVuelo().toInstant();
			LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
			LocalTime currentLocaltime = LocalTime.from(instant.atZone(ZoneId.systemDefault()));
			
			if(currentLocaltime.isBefore(morning) && (DayOfWeek.SUNDAY == localDate.getDayOfWeek() || DayOfWeek.SATURDAY == localDate.getDayOfWeek())) {
				vuelo.setPrecio(null);
			}
			dtos.add(entityToDto(vuelo));
		});
		return dtos;
	}
	
	public Vuelo findById(Long id) {
		return vueloDao.findById(id).orElse(null);
	}
	

	@Override
	public void reservar(VueloDto vueloDto) {
		vueloDao.save(dtoToEntity(vueloDto));
	}
	
	public VueloDto entityToDto(Vuelo vuelo) {
		VueloDto vueloDto = new 
				VueloDto(vuelo.getId(),vuelo.getCodigo(), vuelo.getOrigen(),vuelo.getDestino(), vuelo.getPrecio(), vuelo.getPrecioAlta(), vuelo.getFechaVuelo());
		
		return vueloDto;
	}
	
	public Vuelo dtoToEntity(VueloDto vueloDto) {
		Vuelo vuelo = new Vuelo();
		vuelo.setCodigo(vueloDto.getCodigo());
		vuelo.setPrecio(vueloDto.getPrecio());
		vuelo.setFechaVuelo(vueloDto.getFechaVuelo());
		return vuelo;
	}
}
