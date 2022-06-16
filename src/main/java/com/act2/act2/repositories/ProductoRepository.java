package com.act2.act2.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.act2.act2.modelos.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
    public abstract ArrayList<Producto> findByNombre(String nombre);
}

