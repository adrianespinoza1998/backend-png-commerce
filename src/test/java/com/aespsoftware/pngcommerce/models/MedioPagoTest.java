package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedioPagoTest {

    private MedioPago medioPago;
    @BeforeEach
    void setUp() {
        medioPago = new MedioPago();
        medioPago.setIdMedioPago(1L);
        medioPago.setDescripcion("Efectivo");
        medioPago.setVentas(null);
        medioPago.setEstado(true);
    }

    @Test
    void getIdMedioPago() {
        assertEquals(1L, medioPago.getIdMedioPago());
    }

    @Test
    void getDescripcion() {
        assertEquals("Efectivo", medioPago.getDescripcion());
    }

    @Test
    void getVentas() {
        assertNull(medioPago.getVentas());
    }

    @Test
    void isEstado() {
        assertTrue(medioPago.isEstado());
    }

    @Test
    void setIdMedioPago() {
        medioPago.setIdMedioPago(2L);
        assertEquals(2L, medioPago.getIdMedioPago());
    }

    @Test
    void setDescripcion() {
        medioPago.setDescripcion("Tarjeta de crédito");
        assertEquals("Tarjeta de crédito", medioPago.getDescripcion());
    }

    @Test
    void setVentas() {
        Set<Venta> ventas = new HashSet<>();
        medioPago.setVentas(ventas);

        assertEquals(ventas, medioPago.getVentas());
    }

    @Test
    void setEstado() {
        medioPago.setEstado(false);
        assertFalse(medioPago.isEstado());
    }
}