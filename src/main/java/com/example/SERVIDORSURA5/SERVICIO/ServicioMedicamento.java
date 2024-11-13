package com.example.SERVIDORSURA5.SERVICIO;

import com.example.SERVIDORSURA5.MODELOS.Medicamento;
import com.example.SERVIDORSURA5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedicamento {
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    public Medicamento guardarMedicamento(Medicamento datosMedicamento)throws Exception{
        try {
            return iRepositorioMedicamento.save(datosMedicamento);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}