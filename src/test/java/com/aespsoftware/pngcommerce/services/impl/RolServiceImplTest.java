package com.aespsoftware.pngcommerce.services.impl;

import com.aespsoftware.pngcommerce.dtos.RolDTO;
import com.aespsoftware.pngcommerce.models.Rol;
import com.aespsoftware.pngcommerce.repositories.IRolRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class RolServiceImplTest {
    @Mock
    private IRolRepository rolRepository;
    @InjectMocks
    private RolServiceImpl rolService;

    private Rol rol;
    private RolDTO rolDTO;
    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);

        rol = new Rol();
        rol.setIdRol(Long.valueOf(1));
        rol.setDescripcion("Administrador");
        rol.setEstado(true);

        rolDTO = new RolDTO();
        rolDTO.setIdRol(Long.valueOf(1));
        rolDTO.setDescripcion("Administrador");
        rolDTO.setEstado(true);
    }

    @Test
    void findAll() {
        when(rolRepository.findAllActivated()).thenReturn(Arrays.asList(rol));
        assertNotNull(rolService.findAll());
    }

    @Test
    void save() {
        when(rolRepository.save(rol)).thenReturn(rol);
        assertNotNull(rolService.createRol(rolDTO));
    }

    @Test
    void updateById() {
        when(rolRepository.findById(Long.valueOf(1))).thenReturn(Optional.ofNullable(rol));
        assertNotNull(rolService.updateById(Long.valueOf(1), rolDTO));
    }

}