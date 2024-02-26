package com.deliverytech.deliverysistem.cliente.application.api;
import org.hibernate.validator.constraints.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
	private UUID idCliente; 
}
