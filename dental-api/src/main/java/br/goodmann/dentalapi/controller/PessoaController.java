package br.goodmann.dentalapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.goodmann.dentalapi.model.Pessoa;
import br.goodmann.dentalapi.repository.PessoaRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "${base_url}/pessoa")
public class PessoaController extends BaseController<Pessoa> {

	@Autowired
	private PessoaRepository pessoaRepository;

	@PostMapping
	@ResponseBody
	protected Pessoa save(@RequestBody Pessoa entity) {
		return this.pessoaRepository.save(entity);
	}

	@GetMapping(value = "/{id}")
	protected Optional<Pessoa> getById(@PathVariable(name = "id") Integer id) {
		return this.pessoaRepository.findById(id);
	}

	@GetMapping
	protected Iterable<Pessoa> getAll() {
		return this.pessoaRepository.findAll();
	}

	@PutMapping
	@ResponseBody
	protected Pessoa update(@RequestBody Pessoa entity) {
		return this.pessoaRepository.save(entity);
	}

	@DeleteMapping(value = "/{id}")
	protected void delete(@PathVariable(name = "id") Integer id) {
		this.pessoaRepository.deleteById(id);
	}

}
