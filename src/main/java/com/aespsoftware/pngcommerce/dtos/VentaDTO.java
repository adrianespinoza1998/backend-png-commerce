package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VentaDTO {
	private Long idVenta;
	private Long idUsuario;
	private Long idMedioPago;
	private int montoTotal;
	private Date fecha;
	
	public VentaDTO() {}
}
