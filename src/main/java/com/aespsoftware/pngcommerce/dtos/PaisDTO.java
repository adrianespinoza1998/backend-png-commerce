package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaisDTO {
	private Long idPais;
	private String descripcion;
	private Long idContinente;
	
	public PaisDTO() {}
}
