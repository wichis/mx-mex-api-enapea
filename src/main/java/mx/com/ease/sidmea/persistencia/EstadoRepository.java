package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.EstadoCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Estado;

@Repository
public class EstadoRepository {
	@Autowired
	private EstadoCrudRepository repository;
	
	public List<Estado> getAll() {
		return (List<Estado>) repository.findAll();
	}
	
	public Optional<Estado> getEstado(int estadoId){
		return this.repository.findById(estadoId);
	}
	
	public Estado save(Estado edo) {
		return this.repository.save(edo);
	}
	
	public void delete(int estadoId) {
		this.repository.deleteById(estadoId);
	}
	
	public void delete(Estado edo) {
		this.repository.delete(edo);
	}
}