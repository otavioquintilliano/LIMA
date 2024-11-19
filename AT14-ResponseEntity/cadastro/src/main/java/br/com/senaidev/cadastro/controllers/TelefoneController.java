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

import br.com.senaidev.cadastro.entities.Telefone;
import br.com.senaidev.cadastro.servicies.TelefoneService;


@RestController
@RequestMapping("/telefone")
public class TelefoneController {



@Autowired
private TelefoneService telefoneService;

@PostMapping
public  Telefone createTelefone(@RequestBody Telefone telefone) {
	return telefoneService.saveTelefone(telefone);
}

@PutMapping
public Telefone editTelefone(@RequestBody Telefone telefone) {
	return telefoneService.saveTelefone(telefone);
}

@GetMapping
public List<Telefone> getAlTelefone() {
	return telefoneService.getAllTelefone();
}

@GetMapping("/{id}")
public Telefone getTelefone(@PathVariable Long id) {
	return telefoneService.getTelefoneById(id);
}

@DeleteMapping("/{id}")
public void deleteTelefone(@PathVariable Long id) {
	telefoneService.deleteTelefone(id);
}

}
