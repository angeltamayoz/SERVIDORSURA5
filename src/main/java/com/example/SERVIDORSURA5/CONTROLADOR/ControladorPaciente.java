package com.example.SERVIDORSURA5.CONTROLADOR;

import com.example.SERVIDORSURA5.MODELOS.Paciente;
import com.example.SERVIDORSURA5.SERVICIO.ServicioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paciente")
public class ControladorPaciente {
    @Autowired
    ServicioPaciente servicioPaciente;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Paciente datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioPaciente.guardarPaciente(datos));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> buscar(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioPaciente.buscarPacientes());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
