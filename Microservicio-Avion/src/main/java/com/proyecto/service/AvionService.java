package com.proyecto.service;

import java.util.List;

import com.proyecto.models.Avion;

public interface AvionService{
	
	/**
	 * CRUD
	 */
	Avion findByModelo(String modelo);//Get
	void updateAvion(String modelo, String numeroSerie);//Put
	void deleteAvion(String matricula);//Delete
	void addAvion(Avion avion);//Post
	
	//Metodos especificos
	
	/**
	 * Buscar aviones por fabricante:
	 */
	List<Avion> findAvionesByFabricante(String fabricante);
	
	/**
	 * Buscar aviones por rango de año de fabricación:
	 */
	List<Avion> findAvionesByAnoFabricacionRango(int inicio, int fin);
	
	/**
	 * Buscar aviones por tipo de motor:
	 */
	List<Avion> findAvionesByTipoMotor(String tipoMotor);
	
	/**
	 * Buscar aviones cuya velocidad maxima sea mayor a la dada
	 */
	List<Avion> findAvionesByVelocidadMayor(int velocidadComparar);
	
	/**
	 * Buscar aviones por categoria (comercial, bombardero, cargo etc..)
	 */
	List<Avion> findAvionesByTipo(String tipo);
	
	/**
	 * Devuelve lista de aviones ordenados de manera DESC por velocidad maxima:
	 */
	List<Avion> orderByMasRapidoDesc();
	
	/**
	 * Devuelve lista de aviones ordenados de manera DESC por capacidad de carga:
	 */
	List<Avion> orderByMtowDesc();
}
