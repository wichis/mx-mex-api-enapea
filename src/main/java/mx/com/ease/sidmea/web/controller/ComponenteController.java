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

import mx.com.ease.sidmea.domain.service.ComponenteService;
import mx.com.ease.sidmea.persistencia.entity.Componente;

@RestController
@RequestMapping("/componentes")
public class ComponenteController {
	@Autowired
	private ComponenteService servicio;
	
	@GetMapping("all")
	public List<Componente> getAll(){
		return this.servicio.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Componente> getNivel(@PathVariable("id") int componenteId){
		return this.servicio.getComponente(componenteId);
	}
	
	@PostMapping("/save")
	public Componente save(@RequestBody Componente c) {
		return this.servicio.save(c);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") int componenteId) {
		return this.servicio.delete(componenteId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Componente c) {
		return this.servicio.delete(c);
	}
}
