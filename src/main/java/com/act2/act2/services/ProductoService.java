package com.act2.act2.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.act2.act2.modelos.Producto;
import com.act2.act2.repositories.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    
    public ArrayList<Producto> getAllProducto(){
        return (ArrayList<Producto>) productoRepository.findAll();
    }

    public Producto guardarProducto(Producto productoNuevo){
        return productoRepository.save(productoNuevo);
    }

    public Optional<Producto> obtenerProductoPorId(Integer id){
        return productoRepository.findById(id);
    }

    public boolean eliminarProducto(Integer id) {
        try{
            productoRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
