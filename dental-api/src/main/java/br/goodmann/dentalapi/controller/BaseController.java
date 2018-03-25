package br.goodmann.dentalapi.controller;

import java.util.Optional;

public abstract class BaseController<T> {

	protected abstract T save(T entity);

	protected abstract Optional<T> getById(Integer id);

	protected abstract Iterable<T> getAll();

	protected abstract T update(T entity);

	protected abstract void delete(Integer id);

}
