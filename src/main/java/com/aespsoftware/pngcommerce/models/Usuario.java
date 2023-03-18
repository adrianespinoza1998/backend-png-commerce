package com.aespsoftware.pngcommerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long idUsuario;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido", nullable = false)
	private String apellido;
	
	@Column(name = "correo", nullable = false, unique = true)
	private String correo;
	
	@Column(name = "dni", nullable = false, unique = true)
	private String dni;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
	private Rol rol;
	
	@OneToMany(mappedBy = "usuario")
	private Set<Direccion> direcciones = new HashSet<>();
	
	@OneToMany(mappedBy = "usuario")
	private Set<Venta> ventas = new HashSet<>();
	
	@OneToMany(mappedBy = "usuario")
	private Set<Devolucion> devoluciones = new HashSet<>();

	@Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
	private boolean estado;

	public Usuario() {}
}
