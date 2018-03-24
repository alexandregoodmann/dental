package br.goodmann.dentalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.goodmann.dentalapi.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}
