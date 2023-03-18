package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {
	private Long idProducto;
	private Long idGenerico;
	private Long idMarca;
	private String descripcion;
	private int precio;
	
	public ProductoDTO() {}
}
