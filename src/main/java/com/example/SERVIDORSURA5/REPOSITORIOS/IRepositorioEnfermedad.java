package com.example.SERVIDORSURA5.REPOSITORIOS;

import com.example.SERVIDORSURA5.MODELOS.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioEnfermedad extends JpaRepository<Enfermedad, Long> {
}
