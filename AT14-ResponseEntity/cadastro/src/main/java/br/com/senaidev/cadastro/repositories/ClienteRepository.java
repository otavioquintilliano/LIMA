package br.com.senaidev.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senaidev.cadastro.entities.Cliente;

public interface ClienteRepository  extends  JpaRepository<Cliente, Long> {

}
