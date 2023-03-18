package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "municipio")
@Getter
@Setter
public class Municipio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_municipio", nullable = false)
	private Long idMunicipio;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_region_provincia", referencedColumnName = "id_region_provincia")
	private RegionProvincia regionProvincia;
	
	@OneToMany(mappedBy = "municipio")
	private Set<Direccion> direcciones = new HashSet<>();

	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Municipio() {}
}
