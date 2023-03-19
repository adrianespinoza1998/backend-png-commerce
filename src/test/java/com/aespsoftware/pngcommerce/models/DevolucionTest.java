package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DevolucionTest {

    private Devolucion devolucion;

    @BeforeEach
    void setup(){
        devolucion = new Devolucion();
        devolucion.setIdDevolucion(1L);
        devolucion.setProducto(null);
        devolucion.setUsuario(null);
        devolucion.setMotivo(null);
        devolucion.setVenta(null);
        devolucion.setFecha(null);
        devolucion.setOtrosMotivos(null);
        devolucion.setEstado(true);
    }
    @Test
    void getIdDevolucion() {
        assertEquals(1L, devolucion.getIdDevolucion());
    }

    @Test
    void getProducto() {
        assertEquals(null, devolucion.getProducto());
    }

    @Test
    void getUsuario() {
        assertEquals(null, devolucion.getUsuario());
    }

    @Test
    void getMotivo() {
        assertEquals(null, devolucion.getMotivo());
    }

    @Test
    void getVenta() {
        assertEquals(null, devolucion.getVenta());
    }

    @Test
    void getFecha() {
        assertEquals(null, devolucion.getFecha());
    }

    @Test
    void getOtrosMotivos() {
        assertEquals(null, devolucion.getOtrosMotivos());
    }

    @Test
    void isEstado() {
        assertEquals(true, devolucion.isEstado());
    }

    @Test
    void setIdDevolucion() {
        devolucion.setIdDevolucion(2L);
        assertEquals(2L, devolucion.getIdDevolucion());
    }

    @Test
    void setProducto() {
        Producto producto = new Producto();
        devolucion.setProducto(producto);
        assertEquals(producto, devolucion.getProducto());
    }

    @Test
    void setUsuario() {
        Usuario usuario = new Usuario();
        devolucion.setUsuario(usuario);
        assertEquals(usuario, devolucion.getUsuario());
    }

    @Test
    void setMotivo() {
        Motivo motivo = new Motivo();
        devolucion.setMotivo(motivo);
        assertEquals(motivo, devolucion.getMotivo());
    }

    @Test
    void setVenta() {
        Venta venta = new Venta();
        devolucion.setVenta(venta);
        assertEquals(venta, devolucion.getVenta());
    }

    @Test
    void setFecha() {
        Calendar fecha = Calendar.getInstance();
        fecha.set(2020, Calendar.JANUARY, 1);
        devolucion.setFecha(new Date(fecha.getTimeInMillis()));
        assertEquals(new Date(fecha.getTimeInMillis()), devolucion.getFecha());
    }

    @Test
    void setOtrosMotivos() {
        Set<OtroMotivo> otrosMotivos = new HashSet<>();
        devolucion.setOtrosMotivos(otrosMotivos);
        assertEquals(otrosMotivos, devolucion.getOtrosMotivos());
    }

    @Test
    void setEstado() {
        devolucion.setEstado(false);
        assertEquals(false, devolucion.isEstado());
    }
}