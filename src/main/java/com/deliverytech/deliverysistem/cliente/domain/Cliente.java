package com.deliverytech.deliverysistem.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.deliverytech.deliverysistem.cliente.application.api.ClienteRequest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Document(collection = "cliente")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

	@Id
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@CPF
	@Indexed(unique = true)
	private String cpf;
	@NotNull
	private LocalDate dataDeNascimento;

	private Endereco endereco;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoradaUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.endereco = clienteRequest.getEndereco();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}