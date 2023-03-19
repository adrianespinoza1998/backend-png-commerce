package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtroMotivoTest {

    private OtroMotivo otroMotivo;
    @BeforeEach
    void setUp() {
        otroMotivo = new OtroMotivo();
        otroMotivo.setIdOtroMotivo(1L);
        otroMotivo.setDevolucion(null);
        otroMotivo.setDescripcion("Descripcion");
        otroMotivo.setEstado(true);
    }

    @Test
    void getIdOtroMotivo() {
        assertEquals(1L, otroMotivo.getIdOtroMotivo());
    }

    @Test
    void getDevolucion() {
        assertEquals(null, otroMotivo.getDevolucion());
    }

    @Test
    void getDescripcion() {
        assertEquals("Descripcion", otroMotivo.getDescripcion());
    }

    @Test
    void isEstado() {
        assertTrue(otroMotivo.isEstado());
    }

    @Test
    void setIdOtroMotivo() {
        otroMotivo.setIdOtroMotivo(2L);
        assertEquals(2L, otroMotivo.getIdOtroMotivo());
    }

    @Test
    void setDevolucion() {
        Devolucion devolucion = new Devolucion();
        otroMotivo.setDevolucion(devolucion);
        assertEquals(devolucion, otroMotivo.getDevolucion());
    }

    @Test
    void setDescripcion() {
        otroMotivo.setDescripcion("Descripcion 2");
        assertEquals("Descripcion 2", otroMotivo.getDescripcion());
    }

    @Test
    void setEstado() {
        otroMotivo.setEstado(false);
        assertFalse(otroMotivo.isEstado());
    }
}