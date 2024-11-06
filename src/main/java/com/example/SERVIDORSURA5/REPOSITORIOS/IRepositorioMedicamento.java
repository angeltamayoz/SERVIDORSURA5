package com.example.SERVIDORSURA5.REPOSITORIOS;

import com.example.SERVIDORSURA5.MODELOS.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedicamento extends JpaRepository<Medicamento, Long> {
}
