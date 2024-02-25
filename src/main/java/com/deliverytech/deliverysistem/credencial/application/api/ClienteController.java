package com.deliverytech.deliverysistem.credencial.application.api;

import org.springframework.web.bind.annotation.RestController;

import com.deliverytech.deliverysistem.credencial.application.service.ClienteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public abstract class ClienteController implements ClienteAPI {
	
	private Object clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		private final ClienteService clienteService;
		
		@Override
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[ifinaliza] ClienteController - postCliente");
		return clienteCriado;
	}

}
