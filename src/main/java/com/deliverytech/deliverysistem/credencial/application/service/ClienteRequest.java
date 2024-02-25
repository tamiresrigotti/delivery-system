package com.deliverytech.deliverysistem.credencial.application.service;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.index.Indexed;

import com.deliverytech.deliverysistem.endereco.domain.Endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@CPF
	@Indexed(unique = true)
	private String cpf;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotBlank
	private Endereco endereco;
}
