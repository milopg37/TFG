package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.AerolineaDao;
import com.proyecto.models.Aerolinea;

@Service
public class AerolineaServiceImpls implements AerolineaService {
	
	@Autowired
	private AerolineaDao dao;
	
	//CRUD

	@Override
	public List<Aerolinea> findAllAerolineas() {
		return dao.findAll();
	}

	@Override
	public Aerolinea findByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

	/**
	 * Busca una aerolínea por su nombre y actualizar su flota
      Necesito definir una forma de identificar qué aerolínea actualizo
	 */
	@Override
	public void updateAerolinea(int flota) {
        Aerolinea aerolinea = dao.findById("codigoAerolinea").orElse(null);
        if (aerolinea != null) {
            aerolinea.setFlota(flota);
            dao.save(aerolinea);
        }
	}

	@Override
	public void deleteAerolinea(String codigoAerolinea) {
		dao.deleteById(codigoAerolinea);
	}

	@Override
	public void addAerolinea(Aerolinea aerolinea) {
		dao.save(aerolinea);
	}

	/**
	 * Metodos especificos
	 */

	@Override
	public List<Aerolinea> findByPaisOrigen(String paisOrigen) {
		return dao.findByPaisOrigen(paisOrigen);
	}

	@Override
	public List<Aerolinea> findByTipo(String tipo) {
		return dao.findByTipo(tipo);
	}

	@Override
	public List<Aerolinea> findAerolineasByAnoFundacionBetween(int inicio, int fin) {
		return dao.findByAnoFundacionBetween(inicio, fin);
	}

	@Override
	public long countAerolineasByPaisOrigen(String paisOrigen) {
		return dao.countByPaisOrigen(paisOrigen);
	}

	@Override
	public List<Aerolinea> findAerolineasPorFlotaMayorQue(int flotaMinima) {
		return dao.findByFlotaGreaterThanEqual(flotaMinima);
	}
}
