package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetalleVentaTest {

    private DetalleVenta detalleVenta;

    @BeforeEach
    void setup() {
        detalleVenta = new DetalleVenta();
        detalleVenta.setIdDetalleVenta(1L);
        detalleVenta.setVenta(null);
        detalleVenta.setProducto(null);
        detalleVenta.setDescuento(null);
        detalleVenta.setCantidad(10L);
        detalleVenta.setPrecio(100L);
        detalleVenta.setEstado(true);
    }
    @Test
    void getIdDetalleVenta() {
        assertEquals(1L, detalleVenta.getIdDetalleVenta());
    }

    @Test
    void getVenta() {
        assertEquals(null, detalleVenta.getVenta());
    }

    @Test
    void getProducto() {
        assertEquals(null, detalleVenta.getProducto());
    }

    @Test
    void getDescuento() {
        assertEquals(null, detalleVenta.getDescuento());
    }

    @Test
    void getCantidad() {
        assertEquals(10L, detalleVenta.getCantidad());
    }

    @Test
    void getPrecio() {
        assertEquals(100L, detalleVenta.getPrecio());
    }

    @Test
    void isEstado() {
        assertEquals(true, detalleVenta.isEstado());
    }

    @Test
    void setIdDetalleVenta() {
        detalleVenta.setIdDetalleVenta(2L);
        assertEquals(2L, detalleVenta.getIdDetalleVenta());
    }

    @Test
    void setVenta() {
        Venta venta = new Venta();
        detalleVenta.setVenta(venta);
        assertEquals(venta, detalleVenta.getVenta());
    }

    @Test
    void setProducto() {
        Producto producto = new Producto();
        detalleVenta.setProducto(producto);

        assertEquals(producto, detalleVenta.getProducto());
    }

    @Test
    void setDescuento() {
        Descuento descuento = new Descuento();
        detalleVenta.setDescuento(descuento);

        assertEquals(descuento, detalleVenta.getDescuento());
    }

    @Test
    void setCantidad() {
        detalleVenta.setCantidad(20L);
        assertEquals(20L, detalleVenta.getCantidad());
    }

    @Test
    void setPrecio() {
        detalleVenta.setPrecio(200L);
        assertEquals(200L, detalleVenta.getPrecio());
    }

    @Test
    void setEstado() {
        detalleVenta.setEstado(false);
        assertEquals(false, detalleVenta.isEstado());
    }
}