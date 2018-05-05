package br.goodmann.dentalapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.goodmann.dentalapi.model.Pessoa;

@CrossOrigin
@RestController
@RequestMapping(value = "${base_url}/pessoa")
public class PessoaController extends GenericRestController<Pessoa> {

}
