package mx.com.mex_ico.sidmea.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mex_ico.sidmea.persistencia.crud.EstadoCrudRepository;
import mx.com.mex_ico.sidmea.persistencia.entity.Estado;

@Service
public class EstadoService {
	@Autowired
	private EstadoCrudRepository repository;
	
	public List<Estado> getAll(){
		List<Estado> res = new ArrayList<Estado>();
		Iterable<Estado> it = this.repository.findAll();
		for(Estado edo: it) {
			res.add(edo);
		}
		return res;
	}
	
	public Optional<Estado> getEstado(int estadoId){
		return this.repository.findById(estadoId);
	}
	
	public Estado save(Estado edo) {
		return this.repository.save(edo);
	}
	
	public boolean delete(int estadoId) {
		return getEstado(estadoId).map(state ->{
			this.repository.deleteById(estadoId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(Estado edo) {
		if(this.getEstado(edo.getId()).isPresent()) {
			this.repository.delete(edo);
			return true;
		} else {
			return false;
		}
	}
}
