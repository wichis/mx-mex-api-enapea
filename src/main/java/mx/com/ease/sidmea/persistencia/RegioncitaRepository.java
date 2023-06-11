package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.RegioncitaCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Regioncita;

@Repository
public class RegioncitaRepository {
	@Autowired
	private RegioncitaCrudRepository repository;
	
	public List<Regioncita> getAll(){
		return (List<Regioncita>)this.repository.findAll();
	}
	
	public List<Regioncita> getByEstado(int idEstado){
		return (List<Regioncita>)this.repository.findByIdEstado(idEstado);
	}
	
	public Optional<Regioncita> getRegioncita(int regId){
		return this.repository.findById(regId);
	}

	public Regioncita save(Regioncita r) {
		return this.repository.save(r);
	}
	
	public void delete(int regioncitaId) {
		this.repository.deleteById(regioncitaId);
	}
	
	public void delete(Regioncita regioncita) {
		this.repository.delete(regioncita);
	}
}