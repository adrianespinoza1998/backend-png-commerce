package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RegionProvinciaTest {

    private RegionProvincia regionProvincia;
    @BeforeEach
    void setUp() {
        regionProvincia = new RegionProvincia();
        regionProvincia.setIdRegionProvincia(1L);
        regionProvincia.setDescripcion("Region de prueba");
        regionProvincia.setPais(null);
        regionProvincia.setMunicipios(null);
        regionProvincia.setEstado(true);
    }

    @Test
    void getIdRegionProvincia() {
        assertEquals(1L, regionProvincia.getIdRegionProvincia());
    }

    @Test
    void getDescripcion() {
        assertEquals("Region de prueba", regionProvincia.getDescripcion());
    }

    @Test
    void getPais() {
        assertNull(regionProvincia.getPais());
    }

    @Test
    void getMunicipios() {
        assertNull(regionProvincia.getMunicipios());
    }

    @Test
    void isEstado() {
        assertTrue(regionProvincia.isEstado());
    }

    @Test
    void setIdRegionProvincia() {
        regionProvincia.setIdRegionProvincia(2L);
        assertEquals(2L, regionProvincia.getIdRegionProvincia());
    }

    @Test
    void setDescripcion() {
        regionProvincia.setDescripcion("Region de prueba 2");
        assertEquals("Region de prueba 2", regionProvincia.getDescripcion());
    }

    @Test
    void setPais() {
        Pais pais = new Pais();
        regionProvincia.setPais(pais);
        assertEquals(pais, regionProvincia.getPais());
    }

    @Test
    void setMunicipios() {
        Set<Municipio> municipios = new HashSet<>();
        regionProvincia.setMunicipios(municipios);
        assertEquals(municipios, regionProvincia.getMunicipios());
    }

    @Test
    void setEstado() {
        regionProvincia.setEstado(false);
        assertFalse(regionProvincia.isEstado());
    }
}