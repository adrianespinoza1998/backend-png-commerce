package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", nullable = false)
	private Long idProducto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_generico", referencedColumnName = "id_generico")
	private Generico generico;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
	private Marca marca;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "precio", nullable = false, unique = true)
	private int precio;
	
	@OneToMany(mappedBy = "producto")
	private Set<Descuento> descuentos = new HashSet<>();
	
	@OneToMany(mappedBy = "producto")
	private Set<Devolucion> devoluciones = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Producto() {}
}