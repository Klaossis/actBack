package com.act2.act2.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.act2.act2.modelos.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{
    public abstract ArrayList<Categoria> findByNombre(String nombre);
}
