package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {

    private Venta venta;
    private Calendar calendar;
    @BeforeEach
    void setUp() {
        venta = new Venta();
        venta.setIdVenta(1L);
        venta.setUsuario(null);
        venta.setMedioPago(null);
        venta.setMontoTotal(1000L);
        venta.setFecha(null);
        venta.setDetallesVenta(null);
        venta.setDevoluciones(null);
        venta.setEstado(true);
    }

    @Test
    void getIdVenta() {
        assertEquals(1L, venta.getIdVenta());
    }

    @Test
    void getUsuario() {
        assertNull(venta.getUsuario());
    }

    @Test
    void getMedioPago() {
        assertNull(venta.getMedioPago());
    }

    @Test
    void getMontoTotal() {
        assertEquals(1000L, venta.getMontoTotal());
    }

    @Test
    void getFecha() {
        assertNull(venta.getFecha());
    }

    @Test
    void getDetallesVenta() {
        assertNull(venta.getDetallesVenta());
    }

    @Test
    void getDevoluciones() {
        assertNull(venta.getDevoluciones());
    }

    @Test
    void isEstado() {
        assertTrue(venta.isEstado());
    }

    @Test
    void setIdVenta() {
        venta.setIdVenta(2L);
        assertEquals(2L, venta.getIdVenta());
    }

    @Test
    void setUsuario() {
        Usuario usuario = new Usuario();
        venta.setUsuario(usuario);
        assertEquals(usuario, venta.getUsuario());
    }

    @Test
    void setMedioPago() {
        MedioPago medioPago = new MedioPago();
        venta.setMedioPago(medioPago);
        assertEquals(medioPago, venta.getMedioPago());
    }

    @Test
    void setMontoTotal() {
        venta.setMontoTotal(2000L);
        assertEquals(2000L, venta.getMontoTotal());
    }

    @Test
    void setFecha() {
        calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.JANUARY, 1);
        venta.setFecha(new Date(calendar.getTimeInMillis()));
        assertEquals(new Date(calendar.getTimeInMillis()), venta.getFecha());
    }

    @Test
    void setDetallesVenta() {
        Set<DetalleVenta> detallesVenta = new HashSet<>();
        venta.setDetallesVenta(detallesVenta);
        assertEquals(detallesVenta, venta.getDetallesVenta());
    }

    @Test
    void setDevoluciones() {
        Set<Devolucion> devoluciones = new HashSet<>();
        venta.setDevoluciones(devoluciones);
        assertEquals(devoluciones, venta.getDevoluciones());
    }

    @Test
    void setEstado() {
        venta.setEstado(false);
        assertFalse(venta.isEstado());
    }
}