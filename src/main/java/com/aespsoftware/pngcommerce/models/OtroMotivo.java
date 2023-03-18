package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "otro_motivo")
@Getter
@Setter
public class OtroMotivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_otro_motivo", nullable = false)
	private Long idOtroMotivo;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public OtroMotivo() {}
}
