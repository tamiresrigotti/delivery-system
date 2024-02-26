package com.deliverytech.deliverysistem.cliente.application.api;
import org.hibernate.validator.constraints.UUID;

import lombok.Value;

@Value
public class ClienteResponse {
	private UUID idCliente; 
}
