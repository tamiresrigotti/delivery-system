package com.deliverytech.deliverysistem.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.deliverytech.deliverysistem.cliente.domain.Cliente;
import com.deliverytech.deliverysistem.endereco.domain.Endereco;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.dataDeNascimento = cliente.getDataDeNascimento();
		this.endereco = cliente.getEndereco();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}