package mx.com.ease.sidmea.persistencia.crud;

import org.springframework.data.repository.CrudRepository;

import mx.com.ease.sidmea.persistencia.entity.Estado;

public interface EstadoCrudRepository extends CrudRepository<Estado, Integer>{
	
}