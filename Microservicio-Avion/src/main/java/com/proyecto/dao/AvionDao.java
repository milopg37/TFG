package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.models.Avion;

import jakarta.transaction.Transactional;

public interface AvionDao extends JpaRepository<Avion, Integer> {

	
	//@Query("SELECT a FROM Avion a WHERE a.modelo LIKE :modelo")
	Avion findByModeloLike(@Param("modelo") String modelo);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Avion a WHERE a.matricula = :matricula")
	void deleteAvion(@Param("matricula") String matricula);
	
	//@Query("SELECT a FROM Avion a WHERE a.fabricante LIKE :fabricante")
	List<Avion> findByFabricanteContaining(@Param("fabricante") String fabricante);
	
	//@Query("SELECT a FROM Avion a WHERE a.anoFabricacion BETWEEN :inicio AND :fin")
    List<Avion> findByAnoFabricacionBetween(@Param("inicio") int inicio, @Param("fin") int fin);
	
	//@Query("SELECT a FROM Avion a WHERE a.tipoMotor LIKE :tipoMotor")
    List<Avion> findByTipoMotorLike(@Param("tipoMotor") String tipoMotor);
	
	//@Query("SELECT a FROM Avion a WHERE a.velocidadMaxima > :velocidadComparar")
    List<Avion> findByVelocidadMaximaGreaterThan(@Param("velocidadComparar") int velocidadComparar);
	
	//@Query("SELECT a FROM Avion a WHERE a.tipo = :tipo")
    List<Avion> findByTipo(@Param("tipo") String tipo);
	
	@Query("SELECT a FROM Avion a ORDER BY a.velocidadMaxima DESC")
    List<Avion> findDistinctOrderByVelocidadMaximaDesc();
	
	@Query("SELECT a FROM Avion a ORDER BY a.mtow DESC")
	List<Avion> findOrderByMtowDesc();
}
