package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "continente")
@Getter
@Setter
public class Continente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_continente", nullable = false)
	private Long idContinente;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@OneToMany(mappedBy = "continente")
	private Set<Pais> paises = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Continente() {}
}
