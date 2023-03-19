package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MunicipioTest {

    private Municipio municipio;
    @BeforeEach
    void setUp() {
        municipio = new Municipio();
        municipio.setIdMunicipio(1L);
        municipio.setDescripcion("Municipio de prueba");
        municipio.setRegionProvincia(null);
        municipio.setDirecciones(null);
        municipio.setEstado(true);
    }

    @Test
    void getIdMunicipio() {
        assertEquals(1L, municipio.getIdMunicipio());
    }

    @Test
    void getDescripcion() {
        assertEquals("Municipio de prueba", municipio.getDescripcion());
    }

    @Test
    void getRegionProvincia() {
        assertNull(municipio.getRegionProvincia());
    }

    @Test
    void getDirecciones() {
        assertNull(municipio.getDirecciones());
    }

    @Test
    void isEstado() {
        assertTrue(municipio.isEstado());
    }

    @Test
    void setIdMunicipio() {
        municipio.setIdMunicipio(2L);
        assertEquals(2L, municipio.getIdMunicipio());
    }

    @Test
    void setDescripcion() {
        municipio.setDescripcion("Municipio de prueba 2");
        assertEquals("Municipio de prueba 2", municipio.getDescripcion());
    }

    @Test
    void setRegionProvincia() {
        RegionProvincia regionProvincia = new RegionProvincia();
        municipio.setRegionProvincia(regionProvincia);

        assertEquals(regionProvincia, municipio.getRegionProvincia());
    }

    @Test
    void setDirecciones() {
        Set<Direccion> direcciones = new HashSet<>();
        municipio.setDirecciones(direcciones);

        assertEquals(direcciones, municipio.getDirecciones());
    }

    @Test
    void setEstado() {
        municipio.setEstado(false);
        assertFalse(municipio.isEstado());
    }
}