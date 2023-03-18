package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DireccionDTO {
	private Long idDireccion;
	private int idUsuario;
	private int idMunicipio;
	private String calle;
	private int nro;
	private boolean esDireccPrincipal;
	
	public DireccionDTO () {}
}
