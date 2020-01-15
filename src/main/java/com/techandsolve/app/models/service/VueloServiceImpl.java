package com.techandsolve.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techandsolve.app.models.dao.VueloDao;
import com.techandsolve.app.models.entity.Vuelo;

@Service
public class VueloServiceImpl implements VueloService{
	
	@Autowired
	private VueloDao vueloDao;
	
	@Transactional(readOnly = true)
	public List<Vuelo> findAll(){
		return (List<Vuelo>) vueloDao.findAll();
	}
	
	public Vuelo findById(Long id) {
		return vueloDao.findById(id).orElse(null);
	}

}
