package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "motivo")
@Getter
@Setter
public class Motivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_motivo", nullable = false)
	private Long idMotivo;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@OneToMany(mappedBy = "motivo")
	private Set<Devolucion> devoluciones = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Motivo() {}
}
