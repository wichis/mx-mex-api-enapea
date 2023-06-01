package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.EstadoRepository;
import mx.com.ease.sidmea.persistencia.crud.EstadoCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Estado;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository repository;
	
	public List<Estado> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<Estado> getEstado(int estadoId){
		return this.repository.getEstado(estadoId);
	}
	
	public Estado save(Estado edo) {
		return this.repository.save(edo);
	}
	
	public boolean delete(int estadoId) {
		return getEstado(estadoId).map(state ->{
			this.repository.delete(estadoId);
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