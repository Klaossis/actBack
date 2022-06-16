package com.act2.act2.actividad3;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import com.act2.act2.modelos.Producto;

@FeigClient(name = "productoservicio" ,url = "http://localhost:8080/producto")
public interface ProductoRepository {
    
    @GetMapping("")
    ArrayList<Producto> obteneProductos();
}
