package mx.com.mex_ico.sidmea.persistencia.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.com.mex_ico.sidmea.persistencia.entity.Regioncita;

public interface RegioncitaCrudRepository extends CrudRepository<Regioncita, Integer>{
	/**
	 * Busca todas las regiones de un estado en particular
	 * @param id Identificador del Estado
	 * @return Lista con todas las regiones de un cierto estado.
	 */
	List<Regioncita> findByIdEstado(int id);
}

