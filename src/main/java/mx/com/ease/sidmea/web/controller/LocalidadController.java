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

import mx.com.ease.sidmea.domain.service.LocalidadService;
import mx.com.ease.sidmea.persistencia.entity.Localidad;

@RestController
@RequestMapping("/localidades")
public class LocalidadController {
	@Autowired
	private LocalidadService localidadService;
	
	@GetMapping("all")
	public List<Localidad> getAll() {
		return this.localidadService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Localidad> getLocalidad(@PathVariable("id") int idLocalidad){
		return this.localidadService.getLocalidad(idLocalidad);
	}
	
	@GetMapping("/municipio/{idMunicipio}")
	public Optional<List<Localidad>> getByMunicipio(@PathVariable("idMunicipio") int munId){
		return this.localidadService.getByMunicipio(munId);
	}
	
	@PostMapping("/save")
	public Localidad save(@RequestBody Localidad l) {
		return this.localidadService.save(l);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Localidad l) {
		return this.localidadService.delete(l);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int munId) {
		return this.localidadService.delete(munId);
	}
}