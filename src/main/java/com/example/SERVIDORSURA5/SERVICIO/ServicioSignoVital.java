package com.example.SERVIDORSURA5.SERVICIO;

import com.example.SERVIDORSURA5.MODELOS.SignoVital;
import com.example.SERVIDORSURA5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioSignoVital {
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    public SignoVital guardarSignoVital(SignoVital datosSignoVital) throws Exception {
        try {
            return iRepositorioSignoVital.save(datosSignoVital);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<SignoVital> buscarSignoVital() throws Exception {
        try {
            return iRepositorioSignoVital.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }

    }
}