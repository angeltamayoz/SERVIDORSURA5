package com.example.SERVIDORSURA5.SERVICIO;

import com.example.SERVIDORSURA5.MODELOS.Enfermedad;
import com.example.SERVIDORSURA5.REPOSITORIOS.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEnfermedad {
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad)throws Exception{
        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Enfermedad> buscarEnfermedad() throws Exception{
        try{
            return iRepositorioEnfermedad.findAll();
        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
