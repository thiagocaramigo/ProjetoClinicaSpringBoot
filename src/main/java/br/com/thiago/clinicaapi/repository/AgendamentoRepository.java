package br.com.thiago.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiago.clinicaapi.model.Agendmento;

public interface AgendamentoRepository extends JpaRepository<Agendmento, Long>{

}
