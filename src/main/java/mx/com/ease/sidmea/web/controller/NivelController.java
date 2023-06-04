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

import mx.com.ease.sidmea.domain.service.NivelService;
import mx.com.ease.sidmea.persistencia.entity.Nivel;

@RestController
@RequestMapping("/niveles")
public class NivelController {
	@Autowired
	private NivelService servicio;
	
	@GetMapping("all")
	public List<Nivel> getAll() {
		return this.servicio.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Nivel> getNivel(@PathVariable("id") int nivelId){
		return this.servicio.getNivel(nivelId);
	}
	
	@PostMapping("/save")
	public Nivel save(@RequestBody Nivel n) {
		return this.servicio.save(n);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") int nivelId) {
		return this.servicio.delete(nivelId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Nivel nivel) {
		return this.servicio.delete(nivel);
	}
}
