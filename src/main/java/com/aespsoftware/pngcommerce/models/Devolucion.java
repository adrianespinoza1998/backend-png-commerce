package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "devolucion")
@Getter
@Setter
public class Devolucion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_devolucion", nullable = false)
	private Long idDevolucion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	private Producto producto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_motivo", referencedColumnName = "id_motivo")
	private Motivo motivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
	private Venta venta;
	
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@OneToMany(mappedBy = "devolucion", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<OtroMotivo> otrosMotivos = new HashSet<>();
	
	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;
	
	public Devolucion () {}
}
