package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "direccion")
@Getter
@Setter
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_direccion", nullable = false)
	private Long idDireccion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")
	private Municipio municipios;
	
	@Column(name = "calle", nullable = false)
	private String calle;
	
	@Column(name = "nro", nullable = false)
	private int nro;
	
	@Column(name = "es_direcc_principal", nullable = false)
	private boolean esDireccPrincipal;

	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Direccion () {}
}
