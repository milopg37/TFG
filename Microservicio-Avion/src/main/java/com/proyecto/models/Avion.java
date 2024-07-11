package com.proyecto.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "aviones")
public class Avion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_avion")
	private int idAvion;
	
	@Column (name = "matricula")
	private String matricula;
	
	@Column (name = "fabricante")
	private String fabricante;
	
	@Column (name = "modelo")
	private String modelo;
	
	@Column (name = "numero_serie")
	private String numeroSerie;
	
	@Column (name = "ano_fabricacion")
	private int anoFabricacion;
	
	@Column (name = "tipo")
	private String tipo;
	
	@Column (name = "combustible")
	private String combustible;
	
	@Column (name = "mtow")
	private int mtow;
	
	@Column (name = "tipo_motor")
	private String tipoMotor;
	
	@Column (name = "velocidad_crucero")
	private int velocidadCrucero;
	
	@Column (name = "velocidad_maxima")
	private int velocidadMaxima;
	

	public Avion() {
		super();
	}

	public Avion(int idAvion) {
		super();
		this.idAvion = idAvion;
	}

	public Avion(int idAvion, String matricula, String fabricante, String modelo, String numeroSerie,
			int anoFabricacion, String tipo, String combustible, int mtow, String tipoMotor, int velocidadCrucero,
			int velocidadMaxima) {
		super();
		this.idAvion = idAvion;
		this.matricula = matricula;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.anoFabricacion = anoFabricacion;
		this.tipo = tipo;
		this.combustible = combustible;
		this.mtow = mtow;
		this.tipoMotor = tipoMotor;
		this.velocidadCrucero = velocidadCrucero;
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getMtow() {
		return mtow;
	}

	public void setMtow(int mtow) {
		this.mtow = mtow;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public int getVelocidadCrucero() {
		return velocidadCrucero;
	}

	public void setVelocidadCrucero(int velocidadCrucero) {
		this.velocidadCrucero = velocidadCrucero;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getDescripcion() {
		return "Avión de tipo: " + this.getTipo() + " fabricado en el año " + this.getAnoFabricacion();
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAvion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		return idAvion == other.idAvion;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", matricula=" + matricula + ", fabricante=" + fabricante + ", modelo="
				+ modelo + ", numeroSerie=" + numeroSerie + ", anoFabricacion=" + anoFabricacion + ", tipo=" + tipo
				+ ", combustible=" + combustible + ", mtow=" + mtow + ", tipoMotor=" + tipoMotor + ", velocidadCrucero="
				+ velocidadCrucero + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
}
