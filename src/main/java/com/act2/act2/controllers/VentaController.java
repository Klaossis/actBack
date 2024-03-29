package com.act2.act2.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.act2.act2.modelos.Producto;
import com.act2.act2.services.ProductoService;

@RestController
@RequestMapping("/venta")
public class VentaController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping("/producto")
    public ArrayList<Producto> arrayproducto(){
        return productoService.getAllProducto();
    }
    
}
