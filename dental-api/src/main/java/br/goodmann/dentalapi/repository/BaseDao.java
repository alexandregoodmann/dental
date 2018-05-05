package br.goodmann.dentalapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import br.goodmann.dentalapi.model.BaseModel;

public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

}
