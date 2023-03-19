package com.aespsoftware.pngcommerce.dtos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RolDTOTest {

    @Test
    public void test() {
        RolDTO rolDTO = new RolDTO();

        rolDTO.setDescripcion("descripcion");
        rolDTO.setEstado(true);
        rolDTO.setIdRol(Long.valueOf(1));

        assertEquals("descripcion", rolDTO.getDescripcion());
        assertEquals(true, rolDTO.getEstado());
        assertEquals(Long.valueOf(1), rolDTO.getIdRol());
    }
}
