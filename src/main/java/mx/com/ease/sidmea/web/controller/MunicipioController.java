package mx.com.ease.sidmea.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.ease.sidmea.domain.service.MunicipioService;
import mx.com.ease.sidmea.persistencia.entity.Municipio;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {
	@Autowired
	private MunicipioService municipioService;
	
	@GetMapping("all")
	public List<Municipio> getAll() {
		return this.municipioService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Municipio> getMunicipio(@PathVariable("id") int idMunicipio){
		return this.municipioService.getMunicipio(idMunicipio);
	}
	
	@GetMapping("/estado/{idEstado}")
	public Optional<List<Municipio>> getByEstado(@PathVariable("idEstado") int stateId){
		return this.municipioService.getByEstado(stateId);
	}
	
	@GetMapping("/region/{idRegion}")
	public Optional<List<Municipio>> getByRegion(@PathVariable("idRegion") int regId){
		return this.municipioService.getByRegion(regId);
	}
	
	@PostMapping("/save")
	public Municipio save(@RequestBody Municipio m) {
		return this.municipioService.save(m);
	}
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Municipio m) {
		return this.municipioService.delete(m);
	}
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int municipioId) {
		return this.municipioService.delete(municipioId);
	}
}
