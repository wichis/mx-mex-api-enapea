package mx.com.ease.sidmea.persistencia.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.com.ease.sidmea.persistencia.entity.Municipio;

public interface MunicipioCrudRepository extends CrudRepository<Municipio,Integer>{
	/**
	 * Busca todos los municipios de un estado en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idEstado en la clase Municipio).
	 * 
	 * @param id Identificador del Estado
	 * @return Lista con todos los municipios de un cierto estado.
	 
	List<Municipio> findByIdEstado(int id);
	
	List<Municipio> findByIdEstadoOrderByNombre(int id);*/
	
	/**
	 * Busca todos los municipios de una Region en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idRegion en la clase Municipio).
	 * 
	 * @param id Identificador de la Region.
	 * @return Lista con todos los municipios de una cierta region.
	 */
	List<Municipio> findByIdRegion(int id);
	
	List<Municipio> findByIdRegionOrderByNombre(int id);
}
