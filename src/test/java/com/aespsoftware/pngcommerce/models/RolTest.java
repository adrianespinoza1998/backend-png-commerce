package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RolTest {

    private Rol rol;
    @BeforeEach
    void setUp() {
        rol = new Rol();
        rol.setIdRol(1L);
        rol.setDescripcion("Rol de prueba");
        rol.setEstado(true);
        rol.setUsuarios(null);
    }

    @Test
    void getIdRol() {
        assertEquals(1L, rol.getIdRol());
    }

    @Test
    void getDescripcion() {
        assertEquals("Rol de prueba", rol.getDescripcion());
    }

    @Test
    void isEstado() {
        assertTrue(rol.isEstado());
    }

    @Test
    void getUsuarios() {
        assertNull(rol.getUsuarios());
    }

    @Test
    void setIdRol() {
        rol.setIdRol(2L);
        assertEquals(2L, rol.getIdRol());
    }

    @Test
    void setDescripcion() {
        rol.setDescripcion("Rol de prueba 2");
        assertEquals("Rol de prueba 2", rol.getDescripcion());
    }

    @Test
    void setEstado() {
        rol.setEstado(false);
        assertFalse(rol.isEstado());
    }

    @Test
    void setUsuarios() {
        Set<Usuario> usuarios = new HashSet<>();
        rol.setUsuarios(usuarios);
        assertEquals(usuarios, rol.getUsuarios());
    }
}