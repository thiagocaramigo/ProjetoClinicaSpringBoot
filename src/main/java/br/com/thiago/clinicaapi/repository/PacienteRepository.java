package br.com.thiago.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiago.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
