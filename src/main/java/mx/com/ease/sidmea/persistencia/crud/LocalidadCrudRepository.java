package mx.com.ease.sidmea.persistencia.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.com.ease.sidmea.persistencia.entity.Localidad;
import mx.com.ease.sidmea.persistencia.entity.Regioncita;

public interface LocalidadCrudRepository extends CrudRepository<Localidad,Integer>{
	/**
	 * Busca todas las regiones de un estado en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idEstado en la clase Regioncita).
	 * 
	 * @param id Identificador del Estado
	 * @return Lista con todas las regiones de un cierto estado.
	 */
	List<Localidad> findByIdMunicipio(int id);
	
	List<Regioncita> findByIdMunicipioOrderByNombre(int id);
}