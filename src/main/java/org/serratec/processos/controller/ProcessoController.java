package org.serratec.processos.controller;

import java.util.List;
import java.util.Optional;

import org.serratec.processos.dto.CandidatoDto;
import org.serratec.processos.enums.Curriculo;
import org.serratec.processos.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processos")
public class ProcessoController {
	@Autowired
	private CandidatoService servico;
	
	@GetMapping
	public List<CandidatoDto> obterTodos() {
		return servico.obterTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CandidatoDto> obterPorId(@PathVariable Long id) {
		Optional<CandidatoDto> dto = servico.obterPorId(id);
		if(!dto.isPresent()){
			return ResponseEntity.notFound().build();
		} return ResponseEntity.ok(dto.get());
	}
	
	@GetMapping("/curriculo/{curriculo}")
	public List<CandidatoDto> obterPorStatus(@PathVariable Curriculo statusCurriculo) {
		return servico.obterPorStatus(statusCurriculo); 
		} 
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CandidatoDto cadastrarCandidato(@RequestBody CandidatoDto candidato) {
		return servico.salvarCandidato(candidato);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarCandidato(@PathVariable Long id) {
		if(!servico.apagarCandidato(id)) {
			return ResponseEntity.notFound().build();
		} return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CandidatoDto> alterarCandidato(@PathVariable Long id, @RequestBody CandidatoDto dto) {
		Optional<CandidatoDto> candidatoAlterado = servico.alterarCandidato(id, dto);
		if(!candidatoAlterado.isPresent()) {
			return ResponseEntity.notFound().build();
		} return ResponseEntity.notFound().build();
	} 
	
	

}
