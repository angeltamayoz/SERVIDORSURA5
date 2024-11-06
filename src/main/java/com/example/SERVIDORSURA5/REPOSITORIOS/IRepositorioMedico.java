package com.example.SERVIDORSURA5.REPOSITORIOS;

import com.example.SERVIDORSURA5.MODELOS.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedico extends JpaRepository<Medico, Long> {
}
