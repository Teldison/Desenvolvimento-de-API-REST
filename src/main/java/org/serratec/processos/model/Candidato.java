package org.serratec.processos.model;

import java.time.LocalDate;

import org.serratec.processos.enums.Curriculo;
import org.serratec.processos.enums.Escolaridade;
import org.serratec.processos.enums.Vaga;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidatos")
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate nascimento;
	@Column(unique = true, nullable = false)
	private String cpf;
	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;
	@Enumerated(EnumType.STRING)
	private Vaga vagaDesejada;
	@Enumerated(EnumType.STRING)
	private Curriculo statusCurriculo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	public Vaga getVagaDesejada() {
		return vagaDesejada;
	}
	public void setVagaDesejada(Vaga vagaDesejada) {
		this.vagaDesejada = vagaDesejada;
	}
	public Curriculo getStatusCurriculo() {
		return statusCurriculo;
	}
	public void setStatusCurriculo(Curriculo statusCurriculo) {
		this.statusCurriculo = statusCurriculo;
	}
	
	
	
	
	
}
