package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.models.Aerolinea;
import com.proyecto.service.AerolineaService;

@RestController
public class AerolineaController {

	@Autowired
	AerolineaService servicio;

	// Metodos CRUD

	/**
	 * Busca y devuelve todas las aerolineas
	 * 
	 * @return
	 */
	@GetMapping(value = "/aerolinea/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aerolinea> getAllAerolineas() {
		return servicio.findAllAerolineas();
	}

	/**
	 * Busca y devuelve una aerolinea dado su nombre
	 * 
	 * @param nombre
	 * @return
	 */
	@GetMapping(value = "/aerolinea/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aerolinea getAerolineaByNombre(@PathVariable String nombre) {
		return servicio.findByNombre(nombre);
	}

	/**
	 * Agrega una nueva aerolinea a la BBDD. Se pasa por el request body en formato
	 * JSON
	 * 
	 * @param aerolinea
	 * @return
	 */
	@PostMapping(value = "/aerolinea/addAerolinea", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Aerolinea addAerolinea(@RequestBody Aerolinea aerolinea) {
		servicio.addAerolinea(aerolinea);
		return aerolinea;
	}

	/**
	 * Actualiza la flota de una aerolinea, dado su codigo
	 * 
	 * @param codigoAerolinea
	 * @param flota
	 * @return
	 */
	@PutMapping(value = "/aerolinea/updateFlota/{codigoAerolinea}/{flota}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateAerolineaFlota(@PathVariable String codigoAerolinea, @PathVariable int flota) {
		servicio.updateAerolinea(flota);
	}

	/**
	 * Borra la aerolinea de la BBDD indicando su codigo
	 * 
	 * @param codigoAerolinea
	 */
	@DeleteMapping(value = "/aerolinea/deleteAerolinea/{codigoAerolinea}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteAerolinea(@PathVariable String codigoAerolinea) {
		servicio.deleteAerolinea(codigoAerolinea);
	}

	// Metodos Especificos \\

	/**
	 * Obtener las aerolineas por pais de origen
	 * 
	 * @param paisOrigen
	 * @return
	 */
	@GetMapping(value = "/aerolinea/buscarPorPais/{paisOrigen}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aerolinea> getAerolineasByPaisOrigen(@PathVariable String paisOrigen) {
		return servicio.findByPaisOrigen(paisOrigen);
	}

	/**
	 * Obtener aerolineas segun cual sea su tipo (comercial, militar)
	 * 
	 * @param tipo
	 * @return
	 */
	@GetMapping(value = "/aerolinea/buscarPorTipo/{tipo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aerolinea> getAerolineasByTipo(@PathVariable String tipo) {
		return servicio.findByTipo(tipo);
	}

	/**
	 * Obtener aerolineas fundadas entre un rango de años dado
	 * 
	 * @param inicio
	 * @param fin
	 * @return
	 */
	@GetMapping(value = "/aerolinea/filtrarPorFundacion/{inicio}/{fin}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aerolinea> getAerolineasByAnoFundacionBetween(@PathVariable int inicio, @PathVariable int fin) {
		return servicio.findAerolineasByAnoFundacionBetween(inicio, fin);
	}

	/**
	 * Contar las aerolineas por pais de origen
	 * 
	 * @param paisOrigen
	 * @return
	 */
	@GetMapping(value = "/aerolinea/contarPorPais/{paisOrigen}", produces = MediaType.TEXT_HTML_VALUE)
	public long countAerolineasByPaisOrigen(@PathVariable String paisOrigen) {
		return servicio.countAerolineasByPaisOrigen(paisOrigen);
	}

	/**
	 * Obtener las aerolineas con una flota mayor o igual a la indicada
	 * 
	 * @param flotaMinima
	 * @return
	 */
	@GetMapping("/aerolinea/flotaSuperior/{flotaMinima}")
	public List<Aerolinea> getAerolineasPorFlotaMayorQue(@PathVariable int flotaMinima) {
		return servicio.findAerolineasPorFlotaMayorQue(flotaMinima);
	}
}
