package com.techandsolve.app.transfer;

import java.io.Serializable;
import java.util.Date;

public class VueloDto implements Serializable {

	private static final long serialVersionUID = 910238763970883981L;
	
	private Long id;
	private String codigo;
	private String origen;
	private String destino;
	private String precio;
	private String precioAlta;
	private Date fechaVuelo;
	

	public VueloDto(Long id, String codigo, String origen, String destino, String precio, String precioAlta,
			Date fechaVuelo) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
		this.precioAlta = precioAlta;
		this.fechaVuelo = fechaVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public String getPrecioAlta() {
		return precioAlta;
	}

	public void setPrecioAlta(String precioAlta) {
		this.precioAlta = precioAlta;
	}

	
	
	
}
