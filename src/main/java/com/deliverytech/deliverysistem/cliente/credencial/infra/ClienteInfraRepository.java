package com.deliverytech.deliverysistem.cliente.credencial.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.deliverytech.deliverysistem.cliente.application.repository.ClienteRepository;
import com.deliverytech.deliverysistem.cliente.domain.Cliente;
import com.mongodb.MongoWriteException;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		try {
			clienteSpringDataJPARepository.save(cliente);
		} catch (MongoWriteException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "O cliente associada a este CPF já foi cadastrado!", e);
		}
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesDoId(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - buscaClienteAtravesDoId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
		log.info("[finaliza] PessoaInfraRepository - buscaPessoaAtravesId");
		return cliente;
	}

}
