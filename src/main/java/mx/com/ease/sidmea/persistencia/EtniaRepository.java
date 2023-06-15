package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.EtniaCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Etnia;

@Repository
public class EtniaRepository {
	@Autowired
	private EtniaCrudRepository repository;
	
	public List<Etnia> getAll(){
		return (List<Etnia>) this.repository.findAll();
	}
	
	public Optional<Etnia> getEtnia(int etniaId){
		return this.repository.findById(etniaId);
	}
	
	public Etnia save(Etnia e) {
		return this.repository.save(e);
	}
	
	public void delete(int etniaId) {
		this.repository.deleteById(etniaId);
	}
	
	public void delete(Etnia e) {
		this.repository.delete(e);
	}
}
