package com.act2.act2.modelos;

import javax.persistence.*;

@Entity
@Table(name ="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria", unique = true, nullable = false)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String nombre;
    
    @Column(nullable = false, length = 100)
    private String descripcion;
    
    public Categoria(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
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


}
