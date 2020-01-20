package com.techandsolve.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VUELO")
public class Vuelo implements Serializable{

	private static final long serialVersionUID = 491053910600464752L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CODIGO")
	private String codigo;
	
	@Column(name = "ORIGEN")
	private String origen;
	
	@Column(name = "DESTINO")
	private String destino;
	
	@Column(name = "PRECIO")
	private String precio;
	
	@Column(name = "PRECIO_ALTA")
	private String precioAlta;
	
	@Column(name = "FECHA_VUELO")
	private Date fechaVuelo;
	
	public Vuelo() {}

	public Vuelo(String codigo, String precio,String precioAlta, Date fechaVuelo) {
		this.codigo = codigo;
		this.precio = precio;
		this.fechaVuelo = fechaVuelo;
		this.precioAlta = precioAlta;
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

	public String getPrecioAlta() {
		return precioAlta;
	}

	public void setPrecioAlta(String precioAlta) {
		this.precioAlta = precioAlta;
	}
	
	
	
	
	
}
