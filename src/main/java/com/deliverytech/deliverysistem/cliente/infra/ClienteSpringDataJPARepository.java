package com.deliverytech.deliverysistem.cliente.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deliverytech.deliverysistem.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends MongoRepository<Cliente, UUID>{

}
