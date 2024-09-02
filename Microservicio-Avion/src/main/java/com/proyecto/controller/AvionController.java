package com.proyecto.controller;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.models.Avion;
import com.proyecto.service.AvionService;

@RestController
public class AvionController {

	@Autowired
	AvionService servicio;
	
	// Metodos CRUD
	
	/**
	 * Busca y devuelve un avion cuyo modelo sea parecido a uno que se encuentre en la BD
	 * 
	 * @param modelo
	 * @return
	 */
	@GetMapping(value = "/avion/findByModelo/{modelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	Avion findByModelo(@PathVariable("modelo") String modelo) {
		return servicio.findByModelo(modelo);
	}
	
	/**
	 * Actualiza el numero de serie de un avion mediante busqueda por modelo
	 * 
	 * @param modelo
	 * @param numeroSerie
	 */
	@PutMapping(value = "/avion/updateAvion/{modelo}/{numeroSerie}", produces = MediaType.APPLICATION_JSON_VALUE)
	void updateAvion(@PathVariable("modelo") String modelo, @PathVariable("numeroSerie") String numeroSerie) {
		servicio.updateAvion(modelo, numeroSerie);
	}
	
	/**
	 * Borra un avion de la BD dada su matricula
	 * 
	 * @param matricula
	 */
	@DeleteMapping(value = "/avion/deleteAvion/{matricula}", produces = MediaType.APPLICATION_JSON_VALUE)
	void deleteAvion(@PathVariable("matricula") String matricula) {
		servicio.deleteAvion(matricula);
	}
	
	/**
	 * Agrega un nuevo avion en la BD
	 * 
	 * @param avion
	 */
	@PostMapping(value = "/avion/addAvion", consumes = MediaType.APPLICATION_JSON_VALUE)
	void addAvion(@RequestBody Avion avion) {
		servicio.addAvion(avion);
	}
	
	// Metodos especificos
	
	/**
	 * Devuelve lista de aviones que pertenezcan al fabricante especificado
	 * 
	 * @param fabricante
	 * @return
	 */
	@GetMapping(value = "/avion/byfabricante/{fabricante}")
	List<Avion> findAvionesByFabricante(@PathVariable("fabricante") String fabricante){
		return servicio.findAvionesByFabricante(fabricante);
	}
	
	/**
	 * Devuelve lista de aviones cuyo año de fabricacion se encuentre en el rango dado
	 * 
	 * @param inicio
	 * @param fin
	 * @return
	 */
	@GetMapping(value = "/avion/byfechafabricacion/{inicio}/{fin}")
	List<Avion> findAvionesByAnoFabricacionRango(@PathVariable("inicio") int inicio, @PathVariable("fin") int fin){
		return servicio.findAvionesByAnoFabricacionRango(inicio, fin);
	}
	
	/**
	 * Devuelve lista de aviones filtrando por tipo de motor dado
	 * 
	 * @param tipoMotor
	 * @return
	 */
	@GetMapping(value = "/avion/bytipomotor/{tipomotor}")
	List<Avion> findAvionesByTipoMotor(@PathVariable("tipoMotor") String tipoMotor){
		return servicio.findAvionesByTipoMotor(tipoMotor);
	}
	
	/**
	 * Devuelve lista de aviones cuya velocidad maxima supere la especificada
	 * 
	 * @param velocidadComparar
	 * @return
	 */
	@GetMapping(value = "/avion/byvelocidadmayor/{velocidadComparar}")
	List<Avion> findAvionesByVelocidadMayor(@PathVariable("velocidadComparar") int velocidadComparar){
		return servicio.findAvionesByVelocidadMayor(velocidadComparar);
	}
	
	/**
	 * Devuelve lista de aviones pertenecientes al tipo requerido
	 * 
	 * @param tipo
	 * @return
	 */
	@GetMapping(value = "/avion/bytipo/{tipo}")
	List<Avion> findAvionesByTipo(@PathVariable("tipo") String tipo){
		return servicio.findAvionesByTipo(tipo);
	}
	
	/**
	 * Devuelve la lista de aviones completa ordenandolos por velocidad maxima en descendiente
	 * 
	 * @return
	 */
	@GetMapping(value = "/avion/byvelocidad")
	List<Avion> orderByMasRapidoDesc(){
		return servicio.orderByMasRapidoDesc();
	}
	
	/**
	 * Devuelve lista de aviones completa ordenandolos por MTOW descendiente
	 * 
	 * @return
	 */
	@GetMapping(value = "/avion/bymtwo")
	List<Avion> orderByMtwoDesc(){
		return servicio.orderByMtowDesc();
	}
}
