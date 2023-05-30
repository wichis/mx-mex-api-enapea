package mx.com.mex_ico.sidmea.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mex_ico.sidmea.persistencia.crud.RegioncitaCrudRepository;
import mx.com.mex_ico.sidmea.persistencia.entity.Regioncita;

@Service
public class RegioncitaService {
	@Autowired
	private RegioncitaCrudRepository repository;
	
	public List<Regioncita> getAll(){
		List<Regioncita> res = new ArrayList<Regioncita>();
		Iterable<Regioncita> it = this.repository.findAll();
		for(Regioncita r:it) {
			res.add(r);
		}
		return res;
	}
	
	public Optional<Regioncita> getRegioncita(int id){
		return this.repository.findById(id);
	}
	
	public Optional<List<Regioncita>> getByState(int idEstado){
		return Optional.of(this.repository.findByIdEstado(idEstado));
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
			this.repository.deleteById(regionId);
			return true;
		}).orElse(false);
	}
}
