package br.com.thiago.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiago.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long>{

}


