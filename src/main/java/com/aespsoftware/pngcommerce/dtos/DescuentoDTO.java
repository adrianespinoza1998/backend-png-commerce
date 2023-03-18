package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class DescuentoDTO {
	private Long idDescuento;
	private int idProducto;
	private int porcentajeDscto;
	private boolean activo;
	private Date fechaInicio;
	private Date fechaFin;

	public DescuentoDTO () {}
}
