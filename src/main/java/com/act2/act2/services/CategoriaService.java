package com.act2.act2.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.act2.act2.modelos.Categoria;
import com.act2.act2.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private final CategoriaRepository categoriaRepository;
    
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public ArrayList<Categoria> getAllCategoria(){
        return (ArrayList<Categoria>) categoriaRepository.findAll();
    }

    public Categoria guardarCategoria(Categoria categoriaNueva){
        return categoriaRepository.save(categoriaNueva);
    }

    public Optional<Categoria> obtenerCategoriaPorId(Integer id){
        return categoriaRepository.findById(id);
    }

    public boolean eliminarCategoria(Integer id) {
        try{
            categoriaRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }


}