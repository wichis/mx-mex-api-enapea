package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.NivelEducativoCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.NivelEducativo;

@Repository
public class NivelEducativoRepository {
	@Autowired
	private NivelEducativoCrudRepository repository;
	
	public List<NivelEducativo> getAll(){
		return (List<NivelEducativo>) this.repository.findAll();
	}
	
	public Optional<NivelEducativo> getNivelEdicativo(int nivelEdId){
		return this.repository.findById(nivelEdId);
	}
	
	public NivelEducativo save(NivelEducativo nivel) {
		return this.repository.save(nivel);
	}
	
	public void delete(int nivelEdId) {
		this.repository.deleteById(nivelEdId);
	}
	
	public void delete(NivelEducativo nivel) {
		this.repository.delete(nivel);
	}
}
