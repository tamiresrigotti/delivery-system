package com.deliverytech.deliverysistem.cliente.application.service;

import org.springframework.stereotype.Service;

import com.deliverytech.deliverysistem.cliente.application.api.ClienteRequest;
import com.deliverytech.deliverysistem.cliente.application.api.ClienteResponse;

@Service
public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
