package com.deliverytech.deliverysistem.endereco.domain;

import javax.validation.constraints.NotBlank;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "enderecos")

public class Endereco {
	@NotBlank
	private String rua;
	@NotBlank
	private String numero;
	@NotBlank
	private String cidade;
	@NotBlank
	private String estado;
	@NotBlank
	private String cep;

	public Endereco(@NotBlank String rua, @NotBlank String numero, @NotBlank String cidade, @NotBlank String estado,
			@NotBlank String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
}
