package org.serratec.processos.dto;

import java.time.LocalDate;

import org.serratec.processos.enums.Curriculo;
import org.serratec.processos.enums.Escolaridade;
import org.serratec.processos.enums.Vaga;
import org.serratec.processos.model.Candidato;


public record CandidatoDto(
	Long id,
	String nome,
	LocalDate nascimento,
	String cpf,
	Escolaridade escolaridade,
	Vaga vagaDesejada,
	Curriculo statusCurriculo
	) {
	
	public Candidato toEntity() {
		Candidato candidato = new Candidato();
		candidato.setId(id);
		candidato.setNome(nome);
		candidato.setNascimento(nascimento);
		candidato.setCpf(cpf);
		candidato.setEscolaridade(escolaridade);
		candidato.setVagaDesejada(vagaDesejada);
		candidato.setStatusCurriculo(statusCurriculo);
		return candidato;
	}
	
	public static CandidatoDto toDto(Candidato candidato) {
		return new CandidatoDto(candidato.getId(), candidato.getNome(), candidato.getNascimento(), candidato.getCpf(), candidato.getEscolaridade(), candidato.getVagaDesejada(), candidato.getStatusCurriculo());
	}
	
}
