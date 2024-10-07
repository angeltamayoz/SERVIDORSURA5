package com.example.SERVIDORSURA5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="medicamentos")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratiorio;
    private LocalDate fechaCaducidad;
    private String contraIndicaciones;
    private String registro;
    private Boolean tieneCopago;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, Double dosis, String laboratiorio, LocalDate fechaCaducidad, String contraIndicaciones, String registro, Boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratiorio = laboratiorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraIndicaciones = contraIndicaciones;
        this.registro = registro;
        this.tieneCopago = tieneCopago;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratiorio() {
        return laboratiorio;
    }

    public void setLaboratiorio(String laboratiorio) {
        this.laboratiorio = laboratiorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(String contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Boolean getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(Boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}
