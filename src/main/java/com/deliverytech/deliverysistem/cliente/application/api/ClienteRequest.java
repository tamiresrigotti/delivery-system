package com.deliverytech.deliverysistem.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;

import com.deliverytech.deliverysistem.cliente.domain.Endereco;
import com.mongodb.lang.NonNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteRequest {

	
	@NotBlank
	private String nomeCompleto;
	@CPF
	@Indexed(unique = true)
	private String cpf;
	@NonNull
	private LocalDate dataDeNascimento;
	private Endereco endereco;
}
