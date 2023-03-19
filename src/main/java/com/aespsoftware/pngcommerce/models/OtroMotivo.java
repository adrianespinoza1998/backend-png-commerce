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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_devolucion", referencedColumnName = "id_devolucion", nullable = false)
	private Devolucion devolucion;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public OtroMotivo() {}
}
