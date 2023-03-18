package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "generico")
@Getter
@Setter
public class Generico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_generico", nullable = false)
	private Long idGenerico;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@OneToMany(mappedBy = "generico")
	private Set<Producto> productos = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Generico () {}
}
