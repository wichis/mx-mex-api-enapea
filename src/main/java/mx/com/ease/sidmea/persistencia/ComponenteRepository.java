package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.ComponenteCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Componente;

@Repository
public class ComponenteRepository {
	@Autowired
	ComponenteCrudRepository repository;
	
	public List<Componente> getAll(){
		return (List<Componente>)this.repository.findAll();
	}
	
	public Optional<Componente> getComponente(int compId){
		return this.repository.findById(compId);
	}
	
	public Componente save(Componente c) {
		return this.repository.save(c);
	}
	
	public void delete(int compId) {
		this.repository.deleteById(compId);
	}
	
	public void delete(Componente c) {
		this.repository.delete(c);
	}
}
