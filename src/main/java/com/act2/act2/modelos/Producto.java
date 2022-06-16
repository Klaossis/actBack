package com.act2.act2.modelos;

import javax.persistence.*;


@Entity
@Table(name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto", unique = true, nullable = false)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(nullable = true, length = 30)
    private float costo;

    @Column(nullable = true, length = 30)
    private float varlorVenta;

    @Column(nullable = true)
    private int idCategoria;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false, length = 100)
    private String descripcion;


    public Producto(Integer id, String nombre, float costo, float varlorVenta, int idCategoria, int cantidad,
            String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.varlorVenta = varlorVenta;
        this.idCategoria = idCategoria;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public float getVarlorVenta() {
        return varlorVenta;
    }
    public void setVarlorVenta(float varlorVenta) {
        this.varlorVenta = varlorVenta;
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
