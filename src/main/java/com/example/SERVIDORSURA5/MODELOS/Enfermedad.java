package com.example.SERVIDORSURA5.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="enfermedad")
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String grado;
    private Double probabiliadVida;

    public Enfermedad() {
    }

    public Enfermedad(Long id, String nombre, String sintomas, String clasificacion, String grado, Double probabiliadVida) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabiliadVida = probabiliadVida;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbabiliadVida() {
        return probabiliadVida;
    }

    public void setProbabiliadVida(Double probabiliadVida) {
        this.probabiliadVida = probabiliadVida;
    }
}
