package com.deliverytech.deliverysistem.cliente.application.service;

import java.util.List;
import java.util.UUID;

import com.deliverytech.deliverysistem.cliente.application.api.ClienteDetalhadoResponse;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteListResponse;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();

	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
