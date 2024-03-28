package com.deliverytech.deliverysistem.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import com.deliverytech.deliverysistem.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
	void deletaCliente(Cliente cliente);

}
