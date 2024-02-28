package com.deliverytech.deliverysistem.cliente.application.api;
import java.util.UUID;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ClienteResponse {
	private UUID idCliente;
}
