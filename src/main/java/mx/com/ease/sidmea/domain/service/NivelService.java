package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.NivelRepository;
import mx.com.ease.sidmea.persistencia.entity.Nivel;

@Service
public class NivelService {
	@Autowired
	private NivelRepository respository;
	
	public List<Nivel> getAll() {
		return this.respository.getAll();
	}
	
	public Optional<Nivel> getNivel(int nivelId){
		return this.respository.getNivel(nivelId);
	}
	
	public Nivel save(Nivel n) {
		return this.respository.save(n);
	}
	
	public boolean delete(int nivelId) {
		return getNivel(nivelId).map(state->{
			this.respository.delete(nivelId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(Nivel n) {
		if(getNivel(n.getId()).isPresent()) {
			this.respository.delete(n);
			return true;
		} else {
			return false;
		}
	}
}
