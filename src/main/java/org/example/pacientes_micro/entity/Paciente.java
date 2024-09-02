package org.example.pacientes_micro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String telefono;


}
