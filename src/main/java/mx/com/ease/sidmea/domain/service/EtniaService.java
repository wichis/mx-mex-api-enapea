package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.EtniaRepository;
import mx.com.ease.sidmea.persistencia.entity.Etnia;

@Service
public class EtniaService {
	@Autowired
	private EtniaRepository repository;
	
	public List<Etnia> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<Etnia> getEtnia(int etniaId){
		return this.repository.getEtnia(etniaId);
	}
	
	public Etnia save(Etnia e) {
		return this.repository.save(e);
	}
	
	public boolean delete(int etniaId) {
		return getEtnia(etniaId).map(etnia ->{
			this.repository.delete(etniaId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(Etnia e) {
		if(this.getEtnia(e.getId()).isPresent()) {
			this.repository.delete(e);
			return true;
		} else {
			return false;
		}
	}
}
