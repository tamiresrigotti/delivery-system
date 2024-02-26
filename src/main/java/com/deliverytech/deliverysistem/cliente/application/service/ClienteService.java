package com.deliverytech.deliverysistem.cliente.application.service;

import com.deliverytech.deliverysistem.cliente.application.api.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
