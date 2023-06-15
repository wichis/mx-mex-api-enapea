package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.NivelEducativoRepository;
import mx.com.ease.sidmea.persistencia.entity.NivelEducativo;

@Service
public class NivelEducativoService {
	@Autowired
	private NivelEducativoRepository repository;
	
	public List<NivelEducativo> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<NivelEducativo> getNivelEducativo(int nivelEdId){
		return this.repository.getNivelEdicativo(nivelEdId);
	}
	
	public NivelEducativo save(NivelEducativo nivel) {
		return this.repository.save(nivel);
	}
	
	public boolean delete(int nivelId) {
		return getNivelEducativo(nivelId).map(nivel ->{
			this.repository.delete(nivelId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(NivelEducativo nivel) {
		if(this.getNivelEducativo(nivel.getId()).isPresent()) {
			this.repository.delete(nivel);
			return true;
		} else {
			return false;
		}
	}
}
