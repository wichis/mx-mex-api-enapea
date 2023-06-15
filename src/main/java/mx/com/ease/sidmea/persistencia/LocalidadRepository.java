package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.LocalidadCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Localidad;

@Repository
public class LocalidadRepository {
	@Autowired
	private LocalidadCrudRepository repository;
	
	public List<Localidad> getAll() {
		return (List<Localidad>) this.repository.findAll();
	}
	
	public List<Localidad> getByMunicipio(int idMunicipio){
		return (List<Localidad>) this.repository.findByIdMunicipio(idMunicipio);
	}
	
	public Optional<Localidad> getLocalidad(int localidadId){
		return this.repository.findById(localidadId);
	}
	
	public Localidad save(Localidad local) {
		return this.repository.save(local);
	}
	
	public void delete(int localidadId) {
		this.repository.deleteById(localidadId);
	}
	
	public void delete(Localidad local) {
		this.repository.delete(local);
	}
}