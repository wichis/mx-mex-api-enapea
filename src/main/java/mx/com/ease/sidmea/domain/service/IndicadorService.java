package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.IndicadorRepository;
import mx.com.ease.sidmea.persistencia.entity.Indicador;

@Service
public class IndicadorService {
	@Autowired
	private IndicadorRepository repository;
	
	public List<Indicador> getAll() {
		return this.repository.getAll();
	}
	
	public Optional<Indicador> getIndicador(int inidicadorId){
		return this.repository.getIndicador(inidicadorId);
	}
	
	public Optional<List<Indicador>> getByComponente(int componenteId){
		return Optional.of(this.repository.getByComponente(componenteId));
	}
	
	public Optional<List<Indicador>> getBySubComponente(int subComponenteId){
		return Optional.of(this.repository.getBySubComponente(subComponenteId));
	}
	public Optional<List<Indicador>> getByNivel(int nivelId){
		return Optional.of(this.repository.getByNivel(nivelId));
	}
	
	public Indicador save(Indicador indicador) {
		return this.repository.save(indicador);
	}
	
	public boolean delete(int indicadorId) {
		return getIndicador(indicadorId).map(indicador ->{
			this.repository.delete(indicadorId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(Indicador indicador) {
		if(getIndicador(indicador.getId()).isPresent()) {
			this.repository.delete(indicador);
			return true;
		}else {
			return false;
		}
	}
}