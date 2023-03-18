package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MunicipioDTO {
	private Long idMunicipio;
	private String descripcion;
	private int idRegionProvincia;
	
	public MunicipioDTO() {}
}
