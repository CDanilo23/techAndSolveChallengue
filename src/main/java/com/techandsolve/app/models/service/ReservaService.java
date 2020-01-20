package com.techandsolve.app.models.service;

import java.util.List;

import com.techandsolve.app.models.entity.Reserva;

public interface ReservaService {

	public void reservar(Reserva reserva);
	public List<Reserva> findAllByCedula(String cedula);
	
}
