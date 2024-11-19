package br.com.senaidev.cadastro.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaidev.cadastro.entities.Telefone;
import br.com.senaidev.cadastro.repositories.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired

	private TelefoneRepository telefoneRepository;

	public Telefone saveTelefone(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}

	public List<Telefone> getAllTelefone() {
		return telefoneRepository.findAll();
	}

	public Telefone getTelefoneById(Long id) {
		return telefoneRepository.findById(id).orElse(null);
	}

	public void deleteTelefone(Long id) {
		telefoneRepository.deleteById(id);
	}
}
