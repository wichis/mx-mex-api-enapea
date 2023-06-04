package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.ComponenteRepository;
import mx.com.ease.sidmea.persistencia.entity.Componente;

@Service
public class ComponenteService {
	@Autowired
	private ComponenteRepository repository;
	
	public List<Componente> getAll(){
		return this.repository.getAll();
	}
	
	public Optional<Componente> getComponente(int compId) {
		return this.repository.getComponente(compId);
	}
	
	public Componente save(Componente c) {
		return this.repository.save(c);
	}
	
	public boolean delete(int compId) {
		return getComponente(compId).map(state ->{
			this.repository.delete(compId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(Componente c) {
		if(getComponente(c.getIdComponente()).isPresent()) {
			this.repository.delete(c);
			return true;
		} else {
			return false;
		}
	}
}
