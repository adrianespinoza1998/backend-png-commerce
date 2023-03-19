package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "venta")
@Getter
@Setter
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_venta", nullable = false)
	private Long idVenta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_medio_pago", referencedColumnName = "id_medio_pago")
	private MedioPago medioPago;
	
	@Column(name = "monto_total", nullable = false)
	private Long montoTotal;
	
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@OneToMany(mappedBy = "venta")
	private Set<DetalleVenta> detallesVenta = new HashSet<>();
	
	@OneToMany(mappedBy = "venta")
	private Set<Devolucion> devoluciones = new HashSet<>();

	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;

	public Venta() {}
}
