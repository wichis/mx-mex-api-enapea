package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.IndicadorCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Indicador;

@Repository
public class IndicadorRepository {
	@Autowired
	private IndicadorCrudRepository repository;
	
	public List<Indicador> getAll() {
		return (List<Indicador>) this.repository.findAll();
	}
	
	public Optional<Indicador> getIndicador(int indId){
		return this.repository.findById(indId);
	}
	
	public Indicador save(Indicador indicador) {
		return this.repository.save(indicador);
	}
	
	public void delete(int indId) {
		this.repository.deleteById(indId);
	}
	
	public void delete(Indicador indicador) {
		this.repository.delete(indicador);
	}
	
	public List<Indicador> getByNivel(int nivelId){
		return this.repository.findByIdNivel(nivelId);
	}
	
	public List<Indicador> getByComponente(int compId){
		return this.repository.findByIdComponente(compId);
	}
	
	public List<Indicador> getBySubComponente(int subComponenteId){
		return this.repository.findByIdSubComponente(subComponenteId);
	}
}
