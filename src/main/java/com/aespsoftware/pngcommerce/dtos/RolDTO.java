package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RolDTO {
	private Long idRol;
	private String descripcion;
	private boolean estado;
	
	public RolDTO() {}
}
