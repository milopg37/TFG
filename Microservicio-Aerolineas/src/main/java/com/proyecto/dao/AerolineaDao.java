package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.models.Aerolinea;

public interface AerolineaDao extends JpaRepository<Aerolinea, String> {
	// Tipo de Dato (Modelo) en mi caso Aeolinea y tipo de dato de su PK

	@Query("SELECT a FROM Aerolinea a WHERE a.paisOrigen LIKE :paisOrigen")
	List<Aerolinea> findByPaisOrigen(@Param("paisOrigen") String paisOrigen);

	@Query("SELECT a FROM Aerolinea a WHERE a.tipo LIKE :tipo")
	List<Aerolinea> findByTipo(@Param("tipo") String tipo);

	// Buscar aerolínea por nombre
	Aerolinea findByNombre(String nombre);

	// Método para encontrar aerolíneas fundadas entre un rango de años
	List<Aerolinea> findByAnoFundacionBetween(int inicio, int fin);

	// Método para contar aerolíneas por país de origen
	long countByPaisOrigen(String paisOrigen);

	// Método para buscar aerolíneas con flota mayor o igual a un valor especificado
	List<Aerolinea> findByFlotaGreaterThanEqual(int flotaMinima);
}
