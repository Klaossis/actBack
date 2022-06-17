package com.act2.act2.servicios;

import com.act2.act2.dtos.ProductoDTO;
import com.act2.act2.modelos.Producto;
import com.act2.act2.repositories.ProductoRepository;
import com.act2.act2.services.ProductoService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductoServicioTest {

    @Mock
    private transient ProductoRepository productoRepositorio;

    @InjectMocks
    private ProductoService productoServicio;
    private ProductoDTO productoDTO;
    private Producto producto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        productoDTO = new ProductoDTO();
        productoDTO.setNombre("Platano");
        productoDTO.setDescripcion("Platano amarillo trasngenico");
    }

    @Test
    void getAllProducto() {
        when(productoServicio.getAllProducto()).thenReturn(new ArrayList<>());
        assertNotNull(productoServicio.getAllProducto());
    }

    @Test
    void guardarProducto() {
        when(productoServicio.guardarProducto(producto)).thenReturn(producto);
        assertNotNull(productoServicio.guardarProducto(producto));
    }

    @Test
    void obtenerProductoPorId() {
        assertNotNull(productoServicio.obtenerProductoPorId(1));
    }

    @Test
    void eliminarProducto() {
        assertNotNull(productoServicio.eliminarProducto(1));
    }
}