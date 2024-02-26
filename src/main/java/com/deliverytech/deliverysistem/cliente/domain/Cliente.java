package com.deliverytech.deliverysistem.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.deliverytech.deliverysistem.endereco.domain.Endereco;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoradaUltimaAlteracao;

	
	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @CPF String cpf, @NotNull LocalDate dataDeNascimento,
			@NotBlank Endereco endereco, LocalDateTime dataHoraDoCadastro, LocalDateTime dataHoradaUltimaAlteracao) {
		super();
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataHoraDoCadastro = dataHoraDoCadastro;
		this.dataHoradaUltimaAlteracao = dataHoradaUltimaAlteracao;
	}

}