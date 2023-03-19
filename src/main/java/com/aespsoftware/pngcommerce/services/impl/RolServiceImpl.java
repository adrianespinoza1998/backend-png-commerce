package com.aespsoftware.pngcommerce.services.impl;

import com.aespsoftware.pngcommerce.dtos.RolDTO;
import com.aespsoftware.pngcommerce.models.Rol;
import com.aespsoftware.pngcommerce.repositories.IRolRepository;
import com.aespsoftware.pngcommerce.services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolRepository rolRepository;

    /**
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public List<RolDTO> findAll() {
        List<RolDTO> rolesDTO = new ArrayList<>();
        List<Rol> roles = rolRepository.findAllActivated();

        roles.forEach(rol -> {
            rolesDTO.add(parseRolDTO(rol));
        });

        return rolesDTO;
    }

    /**
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public List<RolDTO> findAllBlocked() {
        List<RolDTO> rolesDTO = new ArrayList<>();
        List<Rol> roles = rolRepository.findAllBlocked();

        roles.forEach(rol -> {
            rolesDTO.add(parseRolDTO(rol));
        });

        return rolesDTO;
    }

    /**
     * @param descripcion
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public RolDTO findByName(String descripcion) {
        Rol rol = rolRepository.findByDescripcion(descripcion);
        return parseRolDTO(rol);
    }

    /**
     * @param id
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public RolDTO findById(Long id) {
        Rol rol = rolRepository.findById(id).orElse(null);
        return parseRolDTO(rol);
    }

    /**
     * @param rolDTO
     * @return
     */
    @Transactional()
    @Override
    public RolDTO createRol(RolDTO rolDTO) {
        Rol rol = parseRolEntity(rolDTO);
        rolRepository.save(rol);
        return parseRolDTO(rol);
    }

    /**
     * @param id
     * @param rolDTO
     * @return
     */
    @Transactional()
    @Override
    public RolDTO updateById(Long id, RolDTO rolDTO) {
        Rol rol = rolRepository.findById(id).orElse(null);

        rol.setDescripcion(rolDTO.getDescripcion());
        rolRepository.save(rol);

        return parseRolDTO(rol);
    }

    /**
     * @param id
     * @return
     */
    @Transactional()
    @Override
    public RolDTO deleteById(Long id) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Transactional()
    @Override
    public RolDTO activateById(Long id) {
        return null;
    }

    /**
     * Internal method to convert Rol JPA entity to the DTO object
     * for frontend data
     * @param rol
     * @return rolDTO
     */
    private RolDTO parseRolDTO(final Rol rol) {
        RolDTO rolDTO = new RolDTO();
        //customerData.setId(customer.getId());
        rolDTO.setIdRol(rol.getIdRol());
        rolDTO.setDescripcion(rol.getDescripcion());
        return rolDTO;
    }

    /**
     * Method to map the front end rol object to the JPA customer entity.
     * @param rolDTO
     * @return rol
     */
    private Rol parseRolEntity(RolDTO rolDTO) {
        Rol rol = new Rol();
        rol.setDescripcion(rolDTO.getDescripcion());
        return rol;
    }
}
