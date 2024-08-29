package org.example.pacientes_micro.controller;

import org.example.pacientes_micro.entity.Paciente;
import org.example.pacientes_micro.service.IPacienteService;
import org.example.pacientes_micro.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteServ;

    @PostMapping("/crear")
    public String crearPaciente(@RequestBody
                                Paciente pac) {
        pacienteServ.savePaciente(pac);
        return "Paciente creado con éxito";
    }

    @GetMapping("/traer")
    public List<Paciente> traerPacientes() {
        return pacienteServ.getPacientes();
    }

    @DeleteMapping("/borrar/{id}")
    public String deletePaciente(
            @PathVariable Long id) {
        pacienteServ.deletePaciente(id);
        return "Paciente borrado con éxito";
    }

    @PutMapping("/editar")
    public Paciente editPaciente(
            @RequestBody Paciente pac) {
        pacienteServ.editPaciente(pac);

        return pacienteServ.findPaciente(
                pac.getIdPaciente());

    }


}
