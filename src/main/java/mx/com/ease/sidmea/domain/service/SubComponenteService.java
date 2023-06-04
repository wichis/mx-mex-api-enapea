package mx.com.ease.sidmea.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ease.sidmea.persistencia.SubComponenteRepository;
import mx.com.ease.sidmea.persistencia.entity.SubComponente;

@Service
public class SubComponenteService {
	@Autowired
	private SubComponenteRepository repository;
	
	public List<SubComponente> getAll() {
		return this.repository.getAll();
	}
	
	public Optional<SubComponente> getSubComponente(int subId){
		return this.repository.getSubComponente(subId);
	}
	
	public Optional<List<SubComponente>> getByComponente(int componenteId){
		return Optional.of(repository.getByComponente(componenteId));
	}
	
	public SubComponente save(SubComponente subComp) {
		return this.repository.save(subComp);
	}
	
	public boolean delete(int subCompId) {
		return getSubComponente(subCompId).map(state->{
			this.repository.delete(subCompId);
			return true;
		}).orElse(false);
	}
	
	public boolean delete(SubComponente sub) {
		if(getSubComponente(sub.getId()).isPresent()) {
			this.repository.delete(sub);
			return true;
		} else {
			return false;
		}
	}
}
