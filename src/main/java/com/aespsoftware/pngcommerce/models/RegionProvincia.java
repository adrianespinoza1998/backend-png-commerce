package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "region_provincia")
@Getter
@Setter
public class RegionProvincia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_region_provincia", nullable = false)
	private Long idRegionProvincia;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pais", referencedColumnName = "id_pais")
	private Pais pais;
	
	@OneToMany(mappedBy = "regionProvincia")
	private Set<Municipio> municipios = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public RegionProvincia () {}
}
