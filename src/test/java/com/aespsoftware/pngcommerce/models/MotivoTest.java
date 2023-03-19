package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MotivoTest {

    private Motivo motivo;
    @BeforeEach
    void setUp() {
        motivo = new Motivo();
        motivo.setIdMotivo(1L);
        motivo.setDescripcion("Motivo de prueba");
        motivo.setDevoluciones(null);
        motivo.setEstado(true);
    }

    @Test
    void getIdMotivo() {
        assertEquals(1L, motivo.getIdMotivo());
    }

    @Test
    void getDescripcion() {
        assertEquals("Motivo de prueba", motivo.getDescripcion());
    }

    @Test
    void getDevoluciones() {
        assertNull(motivo.getDevoluciones());
    }

    @Test
    void isEstado() {
        assertTrue(motivo.isEstado());
    }

    @Test
    void setIdMotivo() {
        motivo.setIdMotivo(2L);
        assertEquals(2L, motivo.getIdMotivo());
    }

    @Test
    void setDescripcion() {
        motivo.setDescripcion("Motivo de prueba 2");
        assertEquals("Motivo de prueba 2", motivo.getDescripcion());
    }

    @Test
    void setDevoluciones() {
        Set<Devolucion> devoluciones = new HashSet<>();
        motivo.setDevoluciones(devoluciones);

        assertEquals(devoluciones, motivo.getDevoluciones());
    }

    @Test
    void setEstado() {
        motivo.setEstado(false);
        assertFalse(motivo.isEstado());
    }
}