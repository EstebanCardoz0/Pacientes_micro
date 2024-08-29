package org.example.pacientes_micro.service;

import org.example.pacientes_micro.entity.Paciente;

import java.util.List;

public interface IPacienteService {

    List<Paciente> getPacientes();

    void savePaciente(Paciente pac);

    void deletePaciente(Long id);

    Paciente findPaciente(Long id);

    void editPaciente(Paciente pac);


}
