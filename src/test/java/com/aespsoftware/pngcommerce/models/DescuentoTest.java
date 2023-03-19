package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DescuentoTest {

    private Descuento descuento;
    private Calendar miCalendario;

    @BeforeEach
    void setup() {
        miCalendario = Calendar.getInstance();
        miCalendario.set(Calendar.YEAR, 2023);
        miCalendario.set(Calendar.MONTH, Calendar.MARCH);
        miCalendario.set(Calendar.DAY_OF_MONTH, 18);

        descuento = new Descuento();
        descuento.setIdDescuento(Long.valueOf(1));
        descuento.setProducto(new Producto());
        descuento.setPorcentajeDscto(0.1);
        descuento.setActivo(true);
        descuento.setFechaInicio(new Date(miCalendario.getTimeInMillis()));

        miCalendario.set(Calendar.YEAR, 2024);
        miCalendario.set(Calendar.MONTH, Calendar.MARCH);
        miCalendario.set(Calendar.DAY_OF_MONTH, 18);

        descuento.setFechaFin(new Date(miCalendario.getTimeInMillis()));
        descuento.setDetallesVenta(null);
        descuento.setEstado(true);
    }

    @Test
    void getIdDescuento() {
        assertEquals(Long.valueOf(1), descuento.getIdDescuento());
    }

    @Test
    void getProducto() {
        assertNotNull(descuento.getProducto());
    }

    @Test
    void getPorcentajeDscto() {
        assertEquals(0.1, descuento.getPorcentajeDscto());
    }

    @Test
    void isActivo() {
        assertEquals(true, descuento.isActivo());
    }

    @Test
    void getFechaInicio() {
        miCalendario.set(Calendar.YEAR, 2023);
        miCalendario.set(Calendar.MONTH, Calendar.MARCH);
        miCalendario.set(Calendar.DAY_OF_MONTH, 18);

        assertEquals(new Date(miCalendario.getTimeInMillis()), descuento.getFechaInicio());
    }

    @Test
    void getFechaFin() {
        miCalendario.set(Calendar.YEAR, 2024);
        miCalendario.set(Calendar.MONTH, Calendar.MARCH);
        miCalendario.set(Calendar.DAY_OF_MONTH, 18);

        assertEquals(new Date(miCalendario.getTimeInMillis()), descuento.getFechaFin());
    }

    @Test
    void getDetallesVenta() {
        assertNull(descuento.getDetallesVenta());
    }

    @Test
    void isEstado() {
        assertEquals(true, descuento.isEstado());
    }

    @Test
    void setIdDescuento() {
        descuento.setIdDescuento(Long.valueOf(2));
        assertEquals(Long.valueOf(2), descuento.getIdDescuento());
    }

    @Test
    void setProducto() {
        Producto producto = new Producto();
        descuento.setProducto(producto);

        assertEquals(producto, descuento.getProducto());
    }

    @Test
    void setPorcentajeDscto() {
        descuento.setPorcentajeDscto(0.2);
        assertEquals(0.2, descuento.getPorcentajeDscto());
    }

    @Test
    void setActivo() {
        descuento.setActivo(false);
        assertEquals(false, descuento.isActivo());
    }

    @Test
    void setFechaInicio() {
        miCalendario.set(Calendar.YEAR, 2024);
        miCalendario.set(Calendar.MONTH, Calendar.MARCH);
        miCalendario.set(Calendar.DAY_OF_MONTH, 18);

        descuento.setFechaInicio(new Date(miCalendario.getTimeInMillis()));

        assertEquals(new Date(miCalendario.getTimeInMillis()), descuento.getFechaInicio());
    }

    @Test
    void setFechaFin() {
        miCalendario.set(Calendar.YEAR, 2025);
        miCalendario.set(Calendar.MONTH, Calendar.MARCH);
        miCalendario.set(Calendar.DAY_OF_MONTH, 18);
        descuento.setFechaFin(new Date(miCalendario.getTimeInMillis()));
        assertEquals(new Date(miCalendario.getTimeInMillis()), descuento.getFechaFin());
    }

    @Test
    void setDetallesVenta() {
        Set<DetalleVenta> detallesVenta = new HashSet<>();
        descuento.setDetallesVenta(detallesVenta);
        assertEquals(detallesVenta, descuento.getDetallesVenta());
    }

    @Test
    void setEstado() {
        descuento.setEstado(false);
        assertEquals(false, descuento.isEstado());
    }
}