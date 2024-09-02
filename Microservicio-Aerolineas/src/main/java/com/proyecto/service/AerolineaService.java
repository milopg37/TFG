package com.proyecto.service;

import java.util.List;


import com.proyecto.models.Aerolinea;

public interface AerolineaService {

	/**
	 * CRUD
	 */
	List<Aerolinea> findAllAerolineas();//Get
	Aerolinea findByNombre(String nombre);//Get
	void updateAerolinea(int flota);//Put
	void deleteAerolinea(String codigoAerolinea);//Delete
	void addAerolinea(Aerolinea aerolinea);//Post
	
	//Metodos especificos
	
	/**
	 * Busca aerolineas por pais de origen
	 */
	List<Aerolinea> findByPaisOrigen(String paisOrigen);
	
	/**
	 * Busca aerolineas dependiendo de su tipo (comercial, militar)
	 */
	List<Aerolinea> findByTipo(String tipo);
	
	/**
	 * Obtener aerlineas fundadas en un rango de años
	 */
	List<Aerolinea> findAerolineasByAnoFundacionBetween(int inicio, int fin);
	
	/**
	 * Contar aerolíneas por país de origen
	 */
    long countAerolineasByPaisOrigen(String paisOrigen);
    
    /**
     * Buscar aerolineas con flota mayor a la especificada
     */
    List<Aerolinea> findAerolineasPorFlotaMayorQue(int flotaMinima);
}
