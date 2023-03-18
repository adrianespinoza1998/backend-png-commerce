package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegionProvinciaDTO {
	private Long idRegionProvincia;
	private String descripcion;
	private Long idPais;
	
	public RegionProvinciaDTO() {}
}
