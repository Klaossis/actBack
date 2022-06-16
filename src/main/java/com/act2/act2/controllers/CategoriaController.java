package com.act2.act2.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.act2.act2.modelos.Categoria;
import com.act2.act2.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    CategoriaService categoraService;

    @ApiOperation(value = "Obtiene todas las categorias")
    @GetMapping()
    public ArrayList<Categoria> getAllCategoria(){
        return categoraService.getAllCategoria();
    }

    @ApiOperation(value = "Se crea nueva categoria, tambien agregando el id actualiza")
    @PostMapping()
    public Categoria guardarCategoria(@RequestBody Categoria categoriaNueva){
        return this.categoraService.guardarCategoria(categoriaNueva);
    }

    @ApiOperation(value = "Se obtiene una categoria por id")
    @GetMapping( path = "/{id}" )
    public Optional<Categoria> obtenerCategoriaPorId(@PathVariable("id") Integer id) {
        return this.categoraService.obtenerCategoriaPorId(id);
    }

    @ApiOperation(value = "Elimina una categoria por id")
    @DeleteMapping( path = "/{id}" )
    public String eliminarCategoria(@PathVariable("id") Integer id){
        boolean ok = this.categoraService.eliminarCategoria(id);
        if(ok){
            return "Se elimino la Categoria con id " + id + " correctamente";
        }else{
            return "No se pudo eliminar la categoria con id " + id;
        }
    }
    
}
