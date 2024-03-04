package com.deliverytech.deliverysistem.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.deliverytech.deliverysistem.endereco.domain.Endereco;

public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private LocalDateTime dataHoraDoCadastro;
}
