package com.techandsolve.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVA")
public class Reserva implements Serializable{

	private static final long serialVersionUID = -29076169793592788L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idreserva;
	
	@Column(name = "NUM_RESERVA")
	private String numReserva;
	
	@Column(name = "CEDULA")
	private String cedula;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "VUELO")
	Vuelo vuelo;


	public Long getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(Long idreserva) {
		this.idreserva = idreserva;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(String numReserva) {
		this.numReserva = numReserva;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	
	
}
