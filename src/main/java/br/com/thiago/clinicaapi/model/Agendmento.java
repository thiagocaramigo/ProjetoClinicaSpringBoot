package br.com.thiago.clinicaapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendmento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgendamento;
	
	@Column
	private Long idPaciente;
	
	@Column
	private Long idMedico;
	
	@Column(nullable = false)
	private Date dataConsulta;
	
	@Column(nullable = false)
	private String horaConsulta;
	
	@Column(nullable = false)
	private String especialidade;

	public Agendmento() {
	}

	public Agendmento(Long idAgendamento, Long idPaciente, Long idMedico, Date dataConsulta, String horaConsulta,
			String especialidade) {
		this.idAgendamento = idAgendamento;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.especialidade = especialidade;
	}

	public Long getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(Long idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
}