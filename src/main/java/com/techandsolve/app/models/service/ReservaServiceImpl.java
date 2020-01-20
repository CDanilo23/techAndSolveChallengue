package com.techandsolve.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techandsolve.app.models.dao.ReservaDao;
import com.techandsolve.app.models.entity.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService{
	
	@Autowired
	ReservaDao reservaDao;
	
	@Override
	public void reservar(Reserva reserva) {
		reservaDao.save(reserva);
	}
	
	@Override
	public List<Reserva> findAllByCedula(String cedula) {
		return (List<Reserva>) reservaDao.findByCedula(cedula);
	}
	
}
