package br.com.senaidev.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senaidev.cadastro.entities.Endereco;

public interface EnderecoRepository extends  JpaRepository<Endereco, Long>  {

}
