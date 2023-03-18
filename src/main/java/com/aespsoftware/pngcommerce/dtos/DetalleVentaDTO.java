package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleVentaDTO {
	private Long idDetalleVenta;
	private int idVenta;
	private int idProducto;
	private int idDescuento;
	private int cantidad;
	private int precio;
	
	public DetalleVentaDTO () {}
}
