package com.deliverytech.deliverysistem.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.deliverytech.deliverysistem.endereco.domain.Endereco;

import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataDeNascimento;
	private Endereco endereco;	
}
