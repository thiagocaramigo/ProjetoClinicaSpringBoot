package br.com.thiago.clinicaapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiago.clinicaapi.model.Agendmento;
import br.com.thiago.clinicaapi.repository.AgendamentoRepository;

@RestController
@RequestMapping("/agenda")
public class AgendamentoController {

	@Autowired
	private AgendamentoRepository ar;
	
	@GetMapping("/listar")
	public List<Agendmento> listar(){
		return ar.findAll();
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Agendmento agendmento) {
		ar.save(agendmento);
		return "Cadastro realizado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id, @RequestBody Agendmento agendmento) {
		Optional<Agendmento> ag = ar.findById(id);
		
		if(!ag.isPresent()) {
			return "Agendamento não localizado";
		}
		agendmento.setIdAgendamento(id);
		ar.save(agendmento);
		return "Agendamento atualizada";
	}
	@DeleteMapping("/apagar/{id}")
 	public String apagar(@PathVariable Long id) {
 		ar.deleteById(id);
 		return "Agendamento apagado";
 	}
}

