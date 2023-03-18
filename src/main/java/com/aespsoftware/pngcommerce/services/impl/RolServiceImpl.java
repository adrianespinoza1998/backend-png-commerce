package com.aespsoftware.pngcommerce.services.impl;

import com.aespsoftware.pngcommerce.dtos.RolDTO;
import com.aespsoftware.pngcommerce.repositories.IRolRepository;
import com.aespsoftware.pngcommerce.services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolRepository rolRepository;

    /**
     * @return
     */
    @Override
    public List<RolDTO> findAll() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<RolDTO> findAllBlocked() {
        return null;
    }

    /**
     * @param descripcion
     * @return
     */
    @Override
    public RolDTO findByName(String descripcion) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public RolDTO findById(Long id) {
        return null;
    }

    /**
     * @param rolDTO
     * @return
     */
    @Override
    public RolDTO createRol(RolDTO rolDTO) {
        return null;
    }

    /**
     * @param id
     * @param rolDTO
     * @return
     */
    @Override
    public RolDTO updateById(Long id, RolDTO rolDTO) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public RolDTO deleteById(Long id) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public RolDTO activateById(Long id) {
        return null;
    }
}
