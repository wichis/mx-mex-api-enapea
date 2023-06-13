package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.MunicipioRepository;
import mx.com.ease.sidmea.persistencia.entity.Municipio;

@Service
public class MunicipioService {
	@Autowired
	private MunicipioRepository repository;
	
	public List<Municipio> getAll() {
		return this.repository.getAll();
	}
	
	public Optional<Municipio> getMunicipio(int id){
		return this.repository.getMunicipio(id);
	}
	
	public Optional<List<Municipio>> getByEstado(int idEstado){
		return Optional.of(this.repository.getByEstado(idEstado));
	}
	
	public Optional<List<Municipio>> getByRegion(int idRegion){
		return Optional.of(this.repository.getByRegion(idRegion));
	}
	
	public Municipio save(Municipio m) {
		return this.repository.save(m);
	}
	
	public boolean delete(Municipio m) {
		if(this.getMunicipio(m.getId()).isPresent()) {
			this.repository.delete(m);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delete(int municipioId) {
		return getMunicipio(municipioId).map(region ->{
			this.repository.delete(municipioId);
			return true;
		}).orElse(false);
	}
}