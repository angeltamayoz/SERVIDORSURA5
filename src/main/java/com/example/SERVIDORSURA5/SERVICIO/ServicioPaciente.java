package com.example.SERVIDORSURA5.SERVICIO;

import com.example.SERVIDORSURA5.MODELOS.Paciente;
import com.example.SERVIDORSURA5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPaciente {
    //1. Llamar al Repositorio respectivo
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //2. Se programan las funciones para las distintas operaciones en la BD
        //Función para guardar datos
    public Paciente guardarPaciente(Paciente datosPaciente)throws Exception{
        try {
            return iRepositorioPaciente.save(datosPaciente);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Paciente> buscarPacientes() throws Exception{
        try{
            return iRepositorioPaciente.findAll();
        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
