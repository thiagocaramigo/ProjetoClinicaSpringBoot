package br.com.thiago.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiago.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

	
}
