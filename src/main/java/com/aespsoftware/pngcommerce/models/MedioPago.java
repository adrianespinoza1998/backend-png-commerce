package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "medio_pago")
@Getter
@Setter
public class MedioPago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_medio_pago", nullable = false)
	private Long idMedioPago;
	
	@Column(name = "descripcion", nullable = false, unique = true)
	private String descripcion;
	
	@OneToMany(mappedBy = "medioPago")
	private Set<Venta> ventas = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public MedioPago() {}
}
