package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "detalle_venta")
@Getter
@Setter
public class DetalleVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_venta", nullable = false)
	private Long idDetalleVenta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
	private Venta venta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	private Producto producto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_descuento", referencedColumnName = "id_descuento")
	private Descuento descuento;
	
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "precio", nullable = false)
	private int precio;
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public DetalleVenta () {}
}
