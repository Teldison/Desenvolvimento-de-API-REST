package org.serratec.processos.service;

import java.util.List;
import java.util.Optional;

import org.serratec.processos.dto.CandidatoDto;
import org.serratec.processos.enums.Curriculo;
import org.serratec.processos.model.Candidato;
import org.serratec.processos.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
	@Autowired
	private CandidatoRepository repositorio;
	
	public List<CandidatoDto> obterTodos() {
		return repositorio.findAll().stream().map(p->CandidatoDto.toDto(p)).toList();
	}
	
	public Optional<CandidatoDto> obterPorId(Long id) {
		if(!repositorio.existsById(id)) {
			return Optional.empty();
		} return Optional.of(CandidatoDto.toDto(repositorio.findById(id).get()));
	}
	
	public CandidatoDto salvarCandidato(CandidatoDto candidato) {
		return CandidatoDto.toDto(repositorio.save(candidato.toEntity()));
	}
	
	public boolean apagarCandidato(Long id) {
		if(!repositorio.existsById(id)) {
			return false;
		} repositorio.deleteById(id);
		return true;
	}
	
	public Optional<CandidatoDto> alterarCandidato(Long id, CandidatoDto dto) {
		if(!repositorio.existsById(id)) {
			return Optional.empty();
		} Candidato pedidoEntity = dto.toEntity();
		  pedidoEntity.setId(id);
		  repositorio.save(pedidoEntity);
		  return Optional.of(CandidatoDto.toDto(pedidoEntity));
	}

	

	public List<CandidatoDto> obterPorStatus(Curriculo statusCurriculo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
