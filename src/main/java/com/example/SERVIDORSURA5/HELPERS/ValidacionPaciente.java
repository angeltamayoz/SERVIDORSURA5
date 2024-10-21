package com.example.SERVIDORSURA5.HELPERS;

import com.example.SERVIDORSURA5.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*public class ValidacionPaciente {
    private Paciente paciente = new Paciente();

    public boolean validarNombre(String nombre){
        String expresionRegular = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombre);
        if (coincidencia.find()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean validaranioNacimiento(LocalDate anioNacimiento){
        return true;
    }

    public boolean validarCiudad(String ciudad){
        String expresionRegular = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(ciudad);
        if (coincidencia.find()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean validarCorreo(String correo){
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@sura\\.com$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(correo);
        if (coincidencia.find()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean validarTelefono(String telefono){
        String expresionRegular = "^\\d+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(telefono);
        if (coincidencia.find()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean validarIps(String ips){
        return true;
    }

    public boolean validarGrupoIngresos(String grupoIngresos){
        return true;
    }

    public boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){
        return true;
    }
}
*/