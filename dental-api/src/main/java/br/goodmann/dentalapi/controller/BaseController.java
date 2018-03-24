package br.goodmann.dentalapi.controller;

import java.util.Optional;

import br.goodmann.dentalapi.model.Pessoa;

public abstract class BaseController<T> {

	protected abstract void save(T entity);

	protected abstract Optional<T> getById(Integer id);

	protected abstract Iterable<Pessoa> getAll();

	protected abstract void update(T entity);

	protected abstract void delete(Integer id);

}
