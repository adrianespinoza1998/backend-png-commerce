package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
	private Long idUsuario;
	private String nombre;
	private String apellido;
	private String correo;
	private String dni;
	private String password;
	private Long idRol;
	
	public UsuarioDTO() {}
}
