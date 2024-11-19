package br.com.senaidev.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senaidev.cadastro.entities.Telefone;

public interface TelefoneRepository  extends  JpaRepository<Telefone, Long>  {

}
