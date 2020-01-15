package com.techandsolve.app.models.service;

import java.util.List;

import com.techandsolve.app.models.entity.Vuelo;

public interface VueloService {

	public List<Vuelo> findAll();
	public Vuelo findById(Long id);
}
