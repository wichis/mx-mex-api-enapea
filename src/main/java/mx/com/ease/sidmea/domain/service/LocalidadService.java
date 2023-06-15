package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.LocalidadRepository;
import mx.com.ease.sidmea.persistencia.entity.Localidad;

@Service
public class LocalidadService {
	@Autowired
	private LocalidadRepository repository;
	
	public List<Localidad> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<Localidad> getLocalidad(int id){
		return this.repository.getLocalidad(id);
	}
	
	public Optional<List<Localidad>> getByMunicipio(int municipioId){
		return Optional.of(this.repository.getByMunicipio(municipioId));
	}
	
	public Localidad save(Localidad local) {
		return this.repository.save(local);
	}
	
	public boolean delete(Localidad local) {
		if(this.getLocalidad(local.getId()).isPresent()) {
			this.repository.delete(local);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delete(int localidadId) {
		return getLocalidad(localidadId).map(region ->{
			this.repository.delete(localidadId);
			return true;
		}).orElse(false);
	}
}