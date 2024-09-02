package com.proyecto.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.proyecto.dao.AvionDao;
import com.proyecto.models.Avion;

public class AvionServiceImplTest {

    @Mock
    private AvionDao dao;

    @InjectMocks
    private AvionServiceImpl avionService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindByModelo() {
        String modelo = "Modelo1";
        Avion avion = new Avion();
        avion.setModelo(modelo);

        when(dao.findByModeloLike(modelo)).thenReturn(avion);

        Avion result = avionService.findByModelo(modelo);
        assertNotNull(result);
        assertEquals(modelo, result.getModelo());
    }

    @Test
    public void testUpdateAvion() {
        String modelo = "Modelo1";
        String numeroSerie = "Serie123";
        Avion avion = new Avion();
        avion.setModelo(modelo);

        when(dao.findByModeloLike(modelo)).thenReturn(avion);

        avionService.updateAvion(modelo, numeroSerie);

        verify(dao).save(avion);
        assertEquals(numeroSerie, avion.getNumeroSerie());
    }

    @Test
    public void testDeleteAvion() {
        String matricula = "Matricula1";
        
        avionService.deleteAvion(matricula);
        
        verify(dao).deleteAvion(matricula);
    }

    @Test
    public void testFindAvionesByFabricante() {
        String fabricante = "Fabricante1";
        List<Avion> aviones = new ArrayList<>();
        
        when(dao.findByFabricanteContaining(fabricante)).thenReturn(aviones);

        List<Avion> result = avionService.findAvionesByFabricante(fabricante);
        assertNotNull(result);
        assertEquals(aviones, result);
    }

    @Test
    public void testOrderByMasRapidoDesc() {
        List<Avion> aviones = new ArrayList<>();
        
        when(dao.findDistinctOrderByVelocidadMaximaDesc()).thenReturn(aviones);

        List<Avion> result = avionService.orderByMasRapidoDesc();
        assertNotNull(result);
        assertEquals(aviones, result);
    }
}
