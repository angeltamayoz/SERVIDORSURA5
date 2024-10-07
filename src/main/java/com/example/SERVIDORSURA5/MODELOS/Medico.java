package com.example.SERVIDORSURA5.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre; //35 caracteres y solo letras
    private String matriculaProfesional; //20 caracteres
    private String especialidad; //maximo 20 caracteres
    private Double salario; //solo positivos, mínimo 10000000 y máximo 20000000
    private String ips; //maximo 50 caracteres
    private String correo; //correo valido @sura.com.co
    private String telefono; //12 caracteres y solo numeros
    private String seguro;
    private String direccion; //50 caracteres
    private Boolean disponibleFinDeSemana;

    public Medico() {
    }

    public Medico(Long id, String nombre, String matriculaProfesional, String especialidad, Double salario, String ips, String correo, String telefono, String seguro, String direccion, Boolean disponibleFinDeSemana) {
        this.id = id;
        this.nombre = nombre;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.seguro = seguro;
        this.direccion = direccion;
        this.disponibleFinDeSemana = disponibleFinDeSemana;
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

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFinDeSemana() {
        return disponibleFinDeSemana;
    }

    public void setDisponibleFinDeSemana(Boolean disponibleFinDeSemana) {
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }
}
