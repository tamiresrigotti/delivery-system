package com.deliverytech.deliverysistem.cliente.application.service;

import org.springframework.stereotype.Service;

import com.deliverytech.deliverysistem.cliente.application.api.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService{

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
