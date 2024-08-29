package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.models.Aerolinea;

public interface AerolineaDao extends JpaRepository<Aerolinea, String> {
	//Tipo de Dato (Modelo) en mi caso Aeolinea y tipo de dato de su PK
	
	List<Aerolinea> findByPaisOrigen(String paisOrigen);

	
}
