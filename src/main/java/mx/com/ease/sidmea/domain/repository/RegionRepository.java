package mx.com.ease.sidmea.domain.repository;

import java.util.List;
import java.util.Optional;

import mx.com.ease.sidmea.domain.Region;

public interface RegionRepository {
	List<Region> getAll();
	Optional<List<Region>> getByState(int stateId);
	
}
