package com.aespsoftware.pngcommerce.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinenteTest {

    private Continente continente;

    @BeforeEach
    void setup() {
        continente = new Continente();
        continente.setIdContinente(Long.valueOf(1));
        continente.setDescripcion("America");
        continente.setEstado(true);
    }

    @Test
    void getIdContinente() {
        assertEquals(Long.valueOf(1), continente.getIdContinente());
    }

    @Test
    void getDescripcion() {
        assertEquals("America", continente.getDescripcion());
    }

    @Test
    void getPaises() {
        assertEquals(0, continente.getPaises().size());
    }

    @Test
    void isEstado() {
        assertEquals(true, continente.isEstado());
    }

    @Test
    void setIdContinente() {
        continente.setIdContinente(Long.valueOf(2));
        assertEquals(Long.valueOf(2), continente.getIdContinente());
    }

    @Test
    void setDescripcion() {
        continente.setDescripcion("Europa");
        assertEquals("Europa", continente.getDescripcion());
    }

    @Test
    void setPaises() {
        continente.setPaises(null);
        assertEquals(null, continente.getPaises());
    }

    @Test
    void setEstado() {
        continente.setEstado(false);
        assertEquals(false, continente.isEstado());
    }
}