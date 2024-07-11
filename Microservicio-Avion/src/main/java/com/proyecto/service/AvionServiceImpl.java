package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.AvionDao;
import com.proyecto.models.Avion;

@Service
public class AvionServiceImpl implements AvionService{

	@Autowired
	private AvionDao dao;

	//CRUD
	
	@Override
	public Avion findByModelo(String modelo) {
		return dao.findByModeloLike(modelo);
	}

	@Override
	public void updateAvion(String modelo, String numeroSerie) {
		Avion avionActualizar = dao.findByModeloLike(modelo);
		avionActualizar.setNumeroSerie(numeroSerie);
		dao.save(avionActualizar);
	}

	@Override
	public void deleteAvion(String matricula) {
		dao.deleteAvion(matricula);
	}

	@Override
	public void addAvion(Avion avion) {
		dao.save(avion);
	}
	
	//Especificos

	@Override
	public List<Avion> findAvionesByFabricante(String fabricante) {
		return dao.findByFabricanteContaining(fabricante);
	}

	@Override
	public List<Avion> findAvionesByAnoFabricacionRango(int inicio, int fin) {
		return dao.findByAnoFabricacionBetween(inicio, fin);
	}

	@Override
	public List<Avion> findAvionesByTipoMotor(String tipoMotor) {
		return dao.findByTipoMotorLike(tipoMotor);
	}

	@Override
	public List<Avion> findAvionesByVelocidadMayor(int velocidadComparar) {
		return dao.findByVelocidadMaximaGreaterThan(velocidadComparar);
	}

	@Override
	public List<Avion> findAvionesByTipo(String tipo) {
		return dao.findByTipo(tipo);
	}

	@Override
	public List<Avion> orderByMasRapidoDesc() {
		return dao.findDistinctOrderByVelocidadMaximaDesc();
	}

	@Override
	public List<Avion> orderByMtowDesc() {
		return dao.findOrderByMtowDesc();
	}
}
