package org.example.pacientes_micro.repository;

import org.example.pacientes_micro.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends
        JpaRepository<Paciente, Long> {
}
