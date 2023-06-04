package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.NivelCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Nivel;

@Repository
public class NivelRepository {
	@Autowired
	private NivelCrudRepository repository;
	
	public List<Nivel> getAll(){
		return (List<Nivel>)this.repository.findAll();
	}
	public Optional<Nivel> getNivel(int nivelId){
		return this.repository.findById(nivelId);
	}
	public Nivel save(Nivel n) {
		return this.repository.save(n);
	}
	public void delete(int nivelId) {
		this.repository.deleteById(nivelId);
	}
	public void delete(Nivel nivel) {
		this.repository.delete(nivel);
	}
}