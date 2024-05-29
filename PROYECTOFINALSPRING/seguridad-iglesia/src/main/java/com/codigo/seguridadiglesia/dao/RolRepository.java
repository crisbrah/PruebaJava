package com.codigo.seguridadiglesia.dao;

import com.codigo.seguridadiglesia.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByNombreRol(String nombrePerfil);
}
