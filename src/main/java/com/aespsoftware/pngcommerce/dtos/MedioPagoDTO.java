package com.aespsoftware.pngcommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedioPagoDTO {
	private Long idMedioPago;
	private String descripcion;
	
	public MedioPagoDTO() {}
}
