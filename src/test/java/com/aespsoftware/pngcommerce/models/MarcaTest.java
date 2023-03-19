package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MarcaTest {

    private Marca marca;

    @BeforeEach
    void setUp() {
        marca = new Marca();
        marca.setIdMarca(1L);
        marca.setDescripcion("Marca 1");
        marca.setProductos(null);
        marca.setEstado(true);
    }
    @Test
    void getIdMarca() {
        assertEquals(1L, marca.getIdMarca());
    }

    @Test
    void getDescripcion() {
        assertEquals("Marca 1", marca.getDescripcion());
    }

    @Test
    void getProductos() {
        assertNull(marca.getProductos());
    }

    @Test
    void isEstado() {
        assertTrue(marca.isEstado());
    }

    @Test
    void setIdMarca() {
        marca.setIdMarca(2L);
        assertEquals(2L, marca.getIdMarca());
    }

    @Test
    void setDescripcion() {
        marca.setDescripcion("Marca 2");
        assertEquals("Marca 2", marca.getDescripcion());
    }

    @Test
    void setProductos() {
        Set<Producto> productos = new HashSet<>();
        marca.setProductos(productos);

        assertEquals(productos, marca.getProductos());
    }

    @Test
    void setEstado() {
        marca.setEstado(false);
        assertFalse(marca.isEstado());
    }
}