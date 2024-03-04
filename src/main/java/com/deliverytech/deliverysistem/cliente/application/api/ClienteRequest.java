package com.deliverytech.deliverysistem.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;

import com.deliverytech.deliverysistem.endereco.domain.Endereco;

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
	private Endereco endereco;	
}
