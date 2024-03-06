package com.deliverytech.deliverysistem.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.deliverytech.deliverysistem.cliente.application.api.request.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.response.ClienteDetalhadoResponse;
import com.deliverytech.deliverysistem.cliente.application.api.response.ClienteListResponse;
import com.deliverytech.deliverysistem.cliente.application.api.response.ClienteResponse;
import com.deliverytech.deliverysistem.cliente.application.repository.ClienteRepository;
import com.deliverytech.deliverysistem.cliente.domain.Cliente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesDoId(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(cliente);
	}
}
