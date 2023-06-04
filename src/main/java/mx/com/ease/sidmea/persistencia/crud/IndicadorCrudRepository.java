package mx.com.ease.sidmea.persistencia.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.com.ease.sidmea.persistencia.entity.Indicador;

public interface IndicadorCrudRepository extends CrudRepository<Indicador,Integer>{
	/**
	 * Busca todos los indicadores de un componente en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idComponente en la clase Indicador).
	 * 
	 * @param id Identificador del componente
	 * @return Lista con todas los indicadores de un cierto componente.
	 */
	List<Indicador> findByIdComponente(int id);
	
	/**
	 * Busca todos los indicadores de un componente en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idSubComponente en la clase Indicador).
	 * 
	 * @param id Identificador del subComponente
	 * @return Lista con todas los indicadores de un cierto componente.
	 */
	List<Indicador> findByIdSubComponente(int id);
	
	/**
	 * Busca todos los indicadores de un componente en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idNivel en la clase Indicador).
	 * 
	 * @param id Identificador del nivel
	 * @return Lista con todas los indicadores de un cierto componente.
	 */
	List<Indicador> findByIdNivel(int id);
}
