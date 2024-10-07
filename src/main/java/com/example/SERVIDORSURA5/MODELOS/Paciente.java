package com.example.SERVIDORSURA5.MODELOS;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre; //35 caracteres y solo letras
    private LocalDate anioNacimiento; //maximo 1900
    private String ciudad; //40 caracteres y solo letras
    private String correo; //correo valido @sura.com.co
    private String telefono; //maximo 12 caracteres y solo número
    private String ips; //maximo 50 caracteres
    private String grupoIngresos; //solo se admite A, B o C en mayúscula
    private Boolean tienePoliza;
    private LocalDate fechaAfiliacion; //no puede ser menor a 2010

    public Paciente() {
    }

    public Paciente(Long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, String grupoIngresos, Boolean tienePoliza, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.grupoIngresos = grupoIngresos;
        this.tienePoliza = tienePoliza;
        this.fechaAfiliacion = fechaAfiliacion;
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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
}
