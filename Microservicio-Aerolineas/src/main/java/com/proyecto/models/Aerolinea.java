package com.proyecto.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "aerolineas")
public class Aerolinea implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_aerolinea")
	private String codigoAerolinea;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "pais_origen")
	private String paisOrigen;

	@Column(name = "flota")
	private int flota;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "ano_fundacion")
	private int anoFundacion;

	public Aerolinea() {
		super();
	}

	public Aerolinea(String codigoAerolinea) {
		super();
		this.codigoAerolinea = codigoAerolinea;
	}

	public Aerolinea(String codigoAerolinea, String nombre, String paisOrigen, int flota, String tipo,
			int anoFundacion) {
		super();
		this.codigoAerolinea = codigoAerolinea;
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.flota = flota;
		this.tipo = tipo;
		this.anoFundacion = anoFundacion;
	}

	public String getCodigoAerolinea() {
		return codigoAerolinea;
	}

	public void setCodigoAerolinea(String codigoAerolinea) {
		this.codigoAerolinea = codigoAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getFlota() {
		return flota;
	}

	public void setFlota(int flota) {
		this.flota = flota;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnoFundacion() {
		return anoFundacion;
	}

	public void setAnoFundacion(int anoFundacion) {
		this.anoFundacion = anoFundacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoAerolinea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aerolinea other = (Aerolinea) obj;
		return Objects.equals(codigoAerolinea, other.codigoAerolinea);
	}

	@Override
	public String toString() {
		return "Aerolinea [codigoAerolinea=" + codigoAerolinea + ", nombre=" + nombre + ", paisOrigen=" + paisOrigen
				+ ", flota=" + flota + ", tipo=" + tipo + ", anoFundacion=" + anoFundacion + "]";
	}
}
