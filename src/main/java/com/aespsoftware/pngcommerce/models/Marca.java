package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "marca")
@Getter
@Setter
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_marca", nullable = false)
	private Long idMarca;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@OneToMany(mappedBy = "marca")
	private Set<Producto> productos = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Marca() {}
}
