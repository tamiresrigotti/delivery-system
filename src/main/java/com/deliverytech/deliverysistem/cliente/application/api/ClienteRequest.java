package com.deliverytech.deliverysistem.cliente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@CPF
	@Indexed(unique = true)
	private String cpf;
	@NotNull
	private LocalDate dataDeNascimento;
}
