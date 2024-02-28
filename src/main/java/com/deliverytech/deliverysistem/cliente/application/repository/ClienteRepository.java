package com.deliverytech.deliverysistem.cliente.application.repository;

import java.util.List;

import com.deliverytech.deliverysistem.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();

}
