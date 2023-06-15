package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.RangoDeEdadRepository;
import mx.com.ease.sidmea.persistencia.entity.RangoDeEdad;

@Service
public class RangoDeEdadService {
	@Autowired
	private RangoDeEdadRepository repository;
	
	public List<RangoDeEdad> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<RangoDeEdad> getRangoDeEdad(int rangoId){
		return this.repository.getRangoDeEdad(rangoId);
	}
	
	public RangoDeEdad save(RangoDeEdad rango) {
		return this.repository.save(rango);
	}
	
	public boolean delete(int rangoId) {
		return getRangoDeEdad(rangoId).map(rango ->{
			this.repository.delete(rangoId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(RangoDeEdad rango) {
		if(this.getRangoDeEdad(rango.getId()).isPresent()) {
			this.repository.delete(rango);
			return true;
		} else {
			return false;
		}
	}
}
