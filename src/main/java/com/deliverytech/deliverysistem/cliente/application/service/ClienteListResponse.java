package com.deliverytech.deliverysistem.cliente.application.service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.deliverytech.deliverysistem.cliente.domain.Cliente;

public class ClienteListResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private LocalDate dataDeNascimento;
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream()
				.map(ClienteListResponse::new)
				.collect(Collectors.toList());
	}

	private ClienteListResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.dataDeNascimento = cliente.getDataDeNascimento();
	}
}
