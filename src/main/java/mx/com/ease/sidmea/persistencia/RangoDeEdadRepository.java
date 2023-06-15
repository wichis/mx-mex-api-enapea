package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.RangoDeEdadCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.RangoDeEdad;

@Repository
public class RangoDeEdadRepository {
	@Autowired
	private RangoDeEdadCrudRepository repository;
	
	public List<RangoDeEdad> getAll(){
		return (List<RangoDeEdad>) this.repository.findAll();
	}
	
	public Optional<RangoDeEdad> getRangoDeEdad(int rangoEdadId){
		return this.repository.findById(rangoEdadId);
	}
	
	public RangoDeEdad save(RangoDeEdad rango) {
		return this.repository.save(rango);
	}
	
	public void delete(int rangoEdadId) {
		this.repository.deleteById(rangoEdadId);
	}
	
	public void delete(RangoDeEdad rango) {
		this.repository.delete(rango);
	}
}
