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

import com.act2.act2.modelos.Producto;
import com.act2.act2.services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @ApiOperation(value = "Obtiene todas los productos")
    @GetMapping
    public ArrayList<Producto> getAllProducto(){
        return productoService.getAllProducto();
    }

    @ApiOperation(value = "Se crea nuevo producto, tambien agregando el id actualiza")
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto productoNuevo){
        return this.productoService.guardarProducto(productoNuevo);
    }

    @ApiOperation(value = "Se obtiene un producto por id")
    @GetMapping( path = "/{id}" )
    public Optional<Producto> obtenerProductoPorId(@PathVariable("id") Integer id) {
        return this.productoService.obtenerProductoPorId(id);
    }

    @ApiOperation(value = "Elimina un producto por id")
    @DeleteMapping( path = "/{id}" )
    public String eliminarProducto(@PathVariable("id") Integer id){
        boolean ok = this.productoService.eliminarProducto(id);
        if(ok){
            return "Se elimino el producto con id " + id + " correctamente";
        }else{
            return "No se pudo eliminar el producto con id " + id;
        }
    }
    
}
