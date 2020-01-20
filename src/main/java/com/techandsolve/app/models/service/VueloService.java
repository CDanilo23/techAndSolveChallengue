package com.techandsolve.app.models.service;

import java.util.List;

import com.techandsolve.app.models.entity.Vuelo;
import com.techandsolve.app.transfer.VueloDto;

public interface VueloService {

	public List<VueloDto> findAll();
	public Vuelo findById(Long id);
	public void reservar(VueloDto vueloDto);
}
