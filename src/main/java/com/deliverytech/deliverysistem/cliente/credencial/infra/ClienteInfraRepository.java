package com.deliverytech.deliverysistem.cliente.credencial.infra;

import org.springframework.stereotype.Repository;

import com.deliverytech.deliverysistem.cliente.application.repository.ClienteRepository;
import com.deliverytech.deliverysistem.cliente.domain.Cliente;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class ClienteInfraRepository implements ClienteRepository {
	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		log.info("[inicia] ClienteInfraRepository - salva");
		return cliente;
	}

}
