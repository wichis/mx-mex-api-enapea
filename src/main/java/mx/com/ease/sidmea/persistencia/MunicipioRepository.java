package mx.com.ease.sidmea.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.crud.MunicipioCrudRepository;
import mx.com.ease.sidmea.persistencia.crud.RegioncitaCrudRepository;
import mx.com.ease.sidmea.persistencia.entity.Municipio;
import mx.com.ease.sidmea.persistencia.entity.Regioncita;

@Repository
public class MunicipioRepository {

	@Autowired
	private MunicipioCrudRepository repository;
	@Autowired
	private RegioncitaCrudRepository auxRepo;
	
	public List<Municipio> getAll(){
		return (List<Municipio>) this.repository.findAll();
	}
	
	public List<Municipio> getByEstado(int idEstado){
		List<Municipio> municipios;
		List<Regioncita> regiones;
		
		municipios = new ArrayList<Municipio>();
		
		//Busca Todas las regiones de un estado
		regiones = (List<Regioncita>) this.auxRepo.findByIdEstado(idEstado);
		//Busca los municipios de cada Region
		for(Regioncita reg: regiones) {
			List<Municipio> lista = this.getByRegion(reg.getId());
			municipios.addAll(lista);
		}
		return municipios;
	}
	
	public List<Municipio> getByRegion(int idRegion){
		return (List<Municipio>) this.repository.findByIdRegion(idRegion);
	}
	public Optional<Municipio> getMunicipio(int munId){
		return this.repository.findById(munId);
	}
	
	public Municipio save(Municipio m) {
		return this.repository.save(m);
	}
	
	public void delete(int municipioId) {
		this.repository.deleteById(municipioId);
	}
	
	public void delete(Municipio m) {
		this.repository.delete(m);
	}
}