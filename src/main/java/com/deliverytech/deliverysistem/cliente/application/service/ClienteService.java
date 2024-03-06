package com.deliverytech.deliverysistem.cliente.application.service;

import java.util.List;
import java.util.UUID;

import com.deliverytech.deliverysistem.cliente.application.api.request.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.response.ClienteDetalhadoResponse;
import com.deliverytech.deliverysistem.cliente.application.api.response.ClienteListResponse;
import com.deliverytech.deliverysistem.cliente.application.api.response.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();

	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
