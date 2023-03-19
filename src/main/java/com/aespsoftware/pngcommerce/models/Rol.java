package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol", nullable = false)
	private Long idRol;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;

	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	@OneToMany(mappedBy = "rol")
	private Set<Usuario> usuarios = new HashSet<>();

	public Rol(){}
}