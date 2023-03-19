package com.aespsoftware.pngcommerce.repositories;

import com.aespsoftware.pngcommerce.models.Rol;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Long> {
    @Query("SELECT r FROM Rol r WHERE r.estado = 1")
    List<Rol> findAllActivated ();

    @Query("SELECT r FROM Rol r WHERE r.estado = 0")
    List<Rol> findAllBlocked ();

    @Query("SELECT r FROM Rol r WHERE r.descripcion LIKE %:descripcion%")
    Rol findByDescripcion (String descripcion);
}
