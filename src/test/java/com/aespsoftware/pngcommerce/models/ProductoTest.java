package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    private Producto producto;
    @BeforeEach
    void setUp() {
        producto = new Producto();
        producto.setIdProducto(1L);
        producto.setGenerico(null);
        producto.setMarca(null);
        producto.setDescripcion("Producto de prueba");
        producto.setPrecio(1000L);
        producto.setDescuentos(null);
        producto.setDevoluciones(null);
        producto.setEstado(true);
    }

    @Test
    void getIdProducto() {
        assertEquals(1L, producto.getIdProducto());
    }

    @Test
    void getGenerico() {
        assertNull(producto.getGenerico());
    }

    @Test
    void getMarca() {
        assertNull(producto.getMarca());
    }

    @Test
    void getDescripcion() {
        assertEquals("Producto de prueba", producto.getDescripcion());
    }

    @Test
    void getPrecio() {
        assertEquals(1000L, producto.getPrecio());
    }

    @Test
    void getDescuentos() {
        assertNull(producto.getDescuentos());
    }

    @Test
    void getDevoluciones() {
        assertNull(producto.getDevoluciones());
    }

    @Test
    void isEstado() {
        assertTrue(producto.isEstado());
    }

    @Test
    void setIdProducto() {
        producto.setIdProducto(2L);
        assertEquals(2L, producto.getIdProducto());
    }

    @Test
    void setGenerico() {
        Generico generico = new Generico();
        producto.setGenerico(generico);
        assertEquals(generico, producto.getGenerico());
    }

    @Test
    void setMarca() {
        Marca marca = new Marca();
        producto.setMarca(marca);
        assertEquals(marca, producto.getMarca());
    }

    @Test
    void setDescripcion() {
        producto.setDescripcion("Producto de prueba 2");
        assertEquals("Producto de prueba 2", producto.getDescripcion());
    }

    @Test
    void setPrecio() {
        producto.setPrecio(2000L);
        assertEquals(2000L, producto.getPrecio());
    }

    @Test
    void setDescuentos() {
        Set<Descuento> descuentos = new HashSet<>();
        producto.setDescuentos(descuentos);
        assertEquals(descuentos, producto.getDescuentos());
    }

    @Test
    void setDevoluciones() {
        Set<Devolucion> devoluciones = new HashSet<>();
        producto.setDevoluciones(devoluciones);
        assertEquals(devoluciones, producto.getDevoluciones());
    }

    @Test
    void setEstado() {
        producto.setEstado(false);
        assertFalse(producto.isEstado());
    }
}