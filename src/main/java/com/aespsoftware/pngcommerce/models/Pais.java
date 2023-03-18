package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pais", nullable = false)
	private Long idPais;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_continente", referencedColumnName = "id_continente")
	private Continente continente;
	
	@OneToMany(mappedBy = "pais")
	private Set<RegionProvincia> regiones = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;

	public Pais() {}
}
