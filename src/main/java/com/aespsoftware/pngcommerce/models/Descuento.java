package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "descuento")
@Getter
@Setter
public class Descuento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_descuento", nullable = false)
	private Long idDescuento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	private Producto producto;
	
	@Column(name = "porcentaje_dscto", nullable = false)
	private double porcentajeDscto;
	
	@Column(name = "activo", nullable = false)
	private boolean activo;
	
	@Column(name = "fecha_inicio", nullable = false)
	private Date fechaInicio;
	
	@Column(name = "fecha_fin", nullable = false)
	private Date fechaFin;

	@OneToMany(mappedBy = "descuento")
	private Set<DetalleVenta> detallesVenta = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Descuento () {}
}
