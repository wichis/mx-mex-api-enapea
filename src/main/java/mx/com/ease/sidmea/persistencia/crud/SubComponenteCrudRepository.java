package mx.com.ease.sidmea.persistencia.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.com.ease.sidmea.persistencia.entity.SubComponente;

public interface SubComponenteCrudRepository extends CrudRepository<SubComponente, Integer>{
	/**
	 * Busca todas los subcomponentes de un componente en particular.
	 * 
	 * <b>Nota:</b> Estamos usando los QueryMethods de Spring, en los
	 * que el select se indica mediante el "findBy" seguido del 
	 * nombre del atributo por el que deseamos buscar (el atributo es
	 * idComponente en la clase SubComponente).
	 * 
	 * @param id Identificador del componente
	 * @return Lista con todas los subcomponentes de un cierto componente.
	 */
	List<SubComponente> findByIdComponente(int id);
	
}
