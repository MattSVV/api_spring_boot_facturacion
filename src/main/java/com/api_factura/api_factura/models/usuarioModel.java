package com.api_factura.api_factura.models;
import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class usuarioModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id; 



    private String nombre;
    private String email;
    private Integer prioridad;


    public usuarioModel(Long id, String nombre, String email, Integer prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }


    public usuarioModel() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getPrioridad() {
        return prioridad;
    }


    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }


    @Override
    public String toString() {
        return "usuarioModel [id=" + id + ", nombre=" + nombre + ", email=" + email + ", prioridad=" + prioridad + "]";
    } 
    
    
}
