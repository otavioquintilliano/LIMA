package br.com.senaidev.cadastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senaidev.cadastro.entities.Endereco;
import br.com.senaidev.cadastro.servicies.EnderecoService;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	
	
	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping
	public  Endereco createEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	
	@PutMapping
	public Endereco editEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}

	@GetMapping
	public List<Endereco> getAllEndereco() {
		return enderecoService.getAllEndereco();
	}

	@GetMapping(value = "/{id}")
	public Endereco getEndereco(@PathVariable Long id) {
		return enderecoService.getEnderecoById(id);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		enderecoService.deleteEndereco(id);
	}

}



