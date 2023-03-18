package com.aespsoftware.pngcommerce.services;

import com.aespsoftware.pngcommerce.dtos.RolDTO;

import java.util.List;

public interface IRolService {
    List<RolDTO> findAll();
    List<RolDTO> findAllBlocked();
    RolDTO findByName(String descripcion);
    RolDTO findById(Long id);
    RolDTO createRol(RolDTO rolDTO);
    RolDTO updateById(Long id, RolDTO rolDTO);
    RolDTO deleteById(Long id);
    RolDTO activateById(Long id);
}
