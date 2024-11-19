package br.com.senaidev.cadastro.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaidev.cadastro.entities.Endereco;
import br.com.senaidev.cadastro.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	
	@Autowired

	private EnderecoRepository enderecoRepository;

	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	public List<Endereco> getAllEndereco() {
		return enderecoRepository.findAll();
	}

	public Endereco getEnderecoById(Long id) {
		return enderecoRepository.findById(id).orElse(null);
	}

	public void deleteEndereco(Long id) {
		enderecoRepository.deleteById(id);
	}
	
	
}
