package com.deliverytech.deliverysistem.cliente.application.service;

import org.springframework.stereotype.Service;

import com.deliverytech.deliverysistem.cliente.application.api.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteResponse;
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
}
