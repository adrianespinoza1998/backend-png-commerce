package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DevolucionDTO {
	private Long idDevolucion;
	private int idProducto;
	private int idUsuario;
	private int idMotivo;
	private int idVenta;
	private Date fecha;
	
	public DevolucionDTO() {}
}
