package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GenericoTest {

    private Generico generico;

    @BeforeEach
    void setUp() {
        generico = new Generico();
        generico.setIdGenerico(1L);
        generico.setDescripcion("Generico 1");
        generico.setProductos(null);
        generico.setEstado(true);
    }

    @Test
    void getIdGenerico() {
        assertEquals(1L, generico.getIdGenerico());
    }

    @Test
    void getDescripcion() {
        assertEquals("Generico 1", generico.getDescripcion());
    }

    @Test
    void getProductos() {
        assertNull(generico.getProductos());
    }

    @Test
    void isEstado() {
        assertTrue(generico.isEstado());
    }

    @Test
    void setIdGenerico() {
        generico.setIdGenerico(2L);
        assertEquals(2L, generico.getIdGenerico());
    }

    @Test
    void setDescripcion() {
        generico.setDescripcion("Generico 2");
        assertEquals("Generico 2", generico.getDescripcion());
    }

    @Test
    void setProductos() {
        Set<Producto> productos = new HashSet<>();
        generico.setProductos(productos);

        assertEquals(productos, generico.getProductos());
    }

    @Test
    void setEstado() {
        generico.setEstado(false);
        assertFalse(generico.isEstado());
    }
}