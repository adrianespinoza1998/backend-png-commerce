package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;
    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        usuario.setIdUsuario(1L);
        usuario.setNombre("Nombre");
        usuario.setApellido("Apellido");
        usuario.setCorreo("Correo");
        usuario.setDni("Dni");
        usuario.setPassword("Password");
        usuario.setRol(null);
        usuario.setDirecciones(null);
        usuario.setVentas(null);
        usuario.setDevoluciones(null);
        usuario.setEstado(true);
    }

    @Test
    void getIdUsuario() {
        assertEquals(1L, usuario.getIdUsuario());
    }

    @Test
    void getNombre() {
        assertEquals("Nombre", usuario.getNombre());
    }

    @Test
    void getApellido() {
        assertEquals("Apellido", usuario.getApellido());
    }

    @Test
    void getCorreo() {
        assertEquals("Correo", usuario.getCorreo());
    }

    @Test
    void getDni() {
        assertEquals("Dni", usuario.getDni());
    }

    @Test
    void getPassword() {
        assertEquals("Password", usuario.getPassword());
    }

    @Test
    void getRol() {
        assertNull(usuario.getRol());
    }

    @Test
    void getDirecciones() {
        assertNull(usuario.getDirecciones());
    }

    @Test
    void getVentas() {
        assertNull(usuario.getVentas());
    }

    @Test
    void getDevoluciones() {
        assertNull(usuario.getDevoluciones());
    }

    @Test
    void isEstado() {
        assertTrue(usuario.isEstado());
    }

    @Test
    void setIdUsuario() {
        usuario.setIdUsuario(2L);
        assertEquals(2L, usuario.getIdUsuario());
    }

    @Test
    void setNombre() {
        usuario.setNombre("Nombre2");
        assertEquals("Nombre2", usuario.getNombre());
    }

    @Test
    void setApellido() {
        usuario.setApellido("Apellido2");
        assertEquals("Apellido2", usuario.getApellido());
    }

    @Test
    void setCorreo() {
        usuario.setCorreo("Correo2");
        assertEquals("Correo2", usuario.getCorreo());
    }

    @Test
    void setDni() {
        usuario.setDni("Dni2");
        assertEquals("Dni2", usuario.getDni());
    }

    @Test
    void setPassword() {
        usuario.setPassword("Password2");
        assertEquals("Password2", usuario.getPassword());
    }

    @Test
    void setRol() {
        Rol rol = new Rol();
        usuario.setRol(rol);
        assertEquals(rol, usuario.getRol());
    }

    @Test
    void setDirecciones() {
        Set<Direccion> direcciones = new HashSet<>();
        usuario.setDirecciones(direcciones);
        assertEquals(direcciones, usuario.getDirecciones());
    }

    @Test
    void setVentas() {
        Set<Venta> ventas = new HashSet<>();
        usuario.setVentas(ventas);
        assertEquals(ventas, usuario.getVentas());
    }

    @Test
    void setDevoluciones() {
        Set<Devolucion> devoluciones = new HashSet<>();
        usuario.setDevoluciones(devoluciones);
        assertEquals(devoluciones, usuario.getDevoluciones());
    }

    @Test
    void setEstado() {
        usuario.setEstado(false);
        assertFalse(usuario.isEstado());
    }
}