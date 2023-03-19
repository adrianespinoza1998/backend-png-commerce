package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PaisTest {

    private Pais pais;
    @BeforeEach
    void setUp() {
        pais = new Pais();
        pais.setIdPais(1L);
        pais.setDescripcion("Descripcion");
        pais.setContinente(null);
        pais.setRegiones(null);
        pais.setEstado(true);
    }

    @Test
    void getIdPais() {
        assertEquals(1L, pais.getIdPais());
    }

    @Test
    void getDescripcion() {
        assertEquals("Descripcion", pais.getDescripcion());
    }

    @Test
    void getContinente() {
        assertNull(pais.getContinente());
    }

    @Test
    void getRegiones() {
        assertNull(pais.getRegiones());
    }

    @Test
    void isEstado() {
        assertTrue(pais.isEstado());
    }

    @Test
    void setIdPais() {
        pais.setIdPais(2L);
        assertEquals(2L, pais.getIdPais());
    }

    @Test
    void setDescripcion() {
        pais.setDescripcion("Descripcion 2");
        assertEquals("Descripcion 2", pais.getDescripcion());
    }

    @Test
    void setContinente() {
        Continente continente = new Continente();
        pais.setContinente(continente);
        assertEquals(continente, pais.getContinente());
    }

    @Test
    void setRegiones() {
        Set<RegionProvincia> regiones = new HashSet<>();
        pais.setRegiones(regiones);
        assertEquals(regiones, pais.getRegiones());
    }

    @Test
    void setEstado() {
        pais.setEstado(false);
        assertFalse(pais.isEstado());
    }
}