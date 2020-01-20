package com.techandsolve.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techandsolve.app.models.entity.Reserva;

public interface ReservaDao extends CrudRepository<Reserva, Long> {
	
	List<Reserva> findByCedula(String cedula);

}
