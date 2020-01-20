package com.techandsolve.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techandsolve.app.models.entity.Reserva;
import com.techandsolve.app.models.service.ReservaService;
import com.techandsolve.app.models.service.VueloService;
import com.techandsolve.app.transfer.VueloDto;

@RestController
@RequestMapping()
@CrossOrigin(origins = "http://localhost:4200")
public class VueloRestController {

	@Autowired
	VueloService service;
	
	@Autowired
	ReservaService reserservice;
	
	@GetMapping("/vuelos")
	public List<VueloDto> getVuelos() {
		return service.findAll();
	} 
	
	@PostMapping("/reservar")
	public void reservar(@RequestBody Reserva reserva) {
		reserservice.reservar(reserva);
	}
	
	@GetMapping("/reservas/{cedula}")
	public List<Reserva> getReservas(@PathVariable("cedula") String cedula) {
		return reserservice.findAllByCedula(cedula);
	} 
	
	
}
