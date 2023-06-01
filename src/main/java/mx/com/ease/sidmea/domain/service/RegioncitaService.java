package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.RegioncitaRepository;
import mx.com.ease.sidmea.persistencia.entity.Regioncita;

@Service
public class RegioncitaService {
	@Autowired
	private RegioncitaRepository repository;
	
	public List<Regioncita> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<Regioncita> getRegioncita(int id){
		return this.repository.getRegioncita(id);
	}
	
	public Optional<List<Regioncita>> getByState(int idEstado){
		return Optional.of(this.repository.getByEstado(idEstado));
	}
	
	public Regioncita save(Regioncita reg) {
		return this.repository.save(reg);
	}
	
	public boolean delete(Regioncita reg) {
		if(this.getRegioncita(reg.getId()).isPresent()) {
			this.repository.delete(reg);
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Busca la Region, si la encuentra la borra y en caso de no 
	 * encontrarla reporta que la operaci&oacute;n no se ha realizado.
	 * @param regionId Identificador de la Region.
	 * @return Bandera que indica si se ha afectado la base o no.
	 */
	public boolean delete(int regionId) {
		return getRegioncita(regionId).map(region ->{
			this.repository.delete(regionId);
			return true;
		}).orElse(false);
	}
}