package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DireccionTest {

    private Direccion direccion;

    @BeforeEach
    void setUp() {
        direccion = new Direccion();
        direccion.setIdDireccion(1L);
        direccion.setUsuario(null);
        direccion.setMunicipio(null);
        direccion.setCalle("Calle");
        direccion.setNro(10);
        direccion.setEsDireccPrincipal(true);
        direccion.setEstado(true);
    }

    @Test
    void getIdDireccion() {
        assertEquals(1L, direccion.getIdDireccion());
    }

    @Test
    void getUsuario() {
        assertEquals(null, direccion.getUsuario());
    }

    @Test
    void getMunicipio() {
        assertEquals(null, direccion.getMunicipio());
    }

    @Test
    void getCalle() {
        assertEquals("Calle", direccion.getCalle());
    }

    @Test
    void getNro() {
        assertEquals(10, direccion.getNro());
    }

    @Test
    void isEsDireccPrincipal() {
        assertEquals(true, direccion.isEsDireccPrincipal());
    }

    @Test
    void isEstado() {
        assertEquals(true, direccion.isEstado());
    }

    @Test
    void setIdDireccion() {
        direccion.setIdDireccion(2L);
        assertEquals(2L, direccion.getIdDireccion());
    }

    @Test
    void setUsuario() {
        Usuario usuario = new Usuario();
        direccion.setUsuario(usuario);

        assertEquals(usuario, direccion.getUsuario());
    }

    @Test
    void setMunicipios() {
        Municipio municipio = new Municipio();
        direccion.setMunicipio(municipio);

        assertEquals(municipio, direccion.getMunicipio());
    }

    @Test
    void setCalle() {
        direccion.setCalle("Calle 2");
        assertEquals("Calle 2", direccion.getCalle());
    }

    @Test
    void setNro() {
        direccion.setNro(20);
        assertEquals(20, direccion.getNro());
    }

    @Test
    void setEsDireccPrincipal() {
        direccion.setEsDireccPrincipal(false);
        assertEquals(false, direccion.isEsDireccPrincipal());
    }

    @Test
    void setEstado() {
        direccion.setEstado(false);
        assertEquals(false, direccion.isEstado());
    }
}