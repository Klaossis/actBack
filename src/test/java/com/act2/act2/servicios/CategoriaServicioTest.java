package com.act2.act2.servicios;

import com.act2.act2.dtos.CategoriaDTO;
import com.act2.act2.modelos.Categoria;
import com.act2.act2.repositories.CategoriaRepository;
import com.act2.act2.services.CategoriaService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CategoriaServicioTest {

    @Mock
    private transient CategoriaRepository categoriaRepositorio;

    @InjectMocks
    private CategoriaService categoriaServicio;
    private CategoriaDTO categoriaDTO;
    private Categoria categoria;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        categoriaDTO = new CategoriaDTO();
        categoriaDTO.setNombre("Frutas");
        categoriaDTO.setDescripcion("Categoria Frutas Test");
    }

    @Test
    void getAllCategoria() {
        when(categoriaServicio.getAllCategoria()).thenReturn(new ArrayList<>());
        assertNotNull(categoriaServicio.getAllCategoria());
    }

    @Test
    void guardarCategoria() {
        when(categoriaServicio.guardarCategoria(categoria)).thenReturn(categoria);
        assertNotNull(categoriaServicio.guardarCategoria(categoria));
    }
    
    @Test
    void obtenerCategoriaPorId() {
        assertNotNull(categoriaServicio.obtenerCategoriaPorId(1));
    }

    @Test
    void eliminarCategoria() {
        assertNotNull(categoriaServicio.eliminarCategoria(2));
    }
}