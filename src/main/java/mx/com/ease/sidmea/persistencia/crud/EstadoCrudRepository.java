package mx.com.ease.sidmea.persistencia.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.ease.sidmea.persistencia.entity.Estado;

public interface EstadoCrudRepository extends CrudRepository<Estado, Integer>{
	
}