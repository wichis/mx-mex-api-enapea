package mx.com.ease.sidmea.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.SubComponenteCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.SubComponente;

@Repository
public class SubComponenteRepository {
	@Autowired
	private SubComponenteCrudRepository repository;
	
	public List<SubComponente> getAll(){
		return (List<SubComponente>) this.repository.findAll();
	}
	
	public Optional<SubComponente> getSubComponente(int subCompId) {
		return this.repository.findById(subCompId);
	}
	
	public SubComponente save(SubComponente subComponente) {
		return this.repository.save(subComponente);
	}
	
	public void delete(int idSubComponente) {
		this.repository.deleteById(idSubComponente);
	}
	
	public void delete(SubComponente sub) {
		this.repository.delete(sub);
	}
	
	public List<SubComponente> getByComponente(int cId){
		return this.repository.findByIdComponente(cId);
	}
}
