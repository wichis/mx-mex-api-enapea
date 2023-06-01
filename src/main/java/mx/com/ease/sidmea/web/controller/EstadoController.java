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

import mx.com.ease.sidmea.domain.service.EstadoService;
import mx.com.ease.sidmea.persistencia.entity.Estado;
import mx.com.ease.sidmea.persistencia.entity.Regioncita;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("all")
	public List<Estado> getAll(){
		return this.estadoService.getAll();
	}
	@GetMapping("/{id}")
	public Optional<Estado> getState(@PathVariable("id") int stateId){
		return this.estadoService.getEstado(stateId);
	}
	@PostMapping("/save")
	public Estado save(@RequestBody Estado s) {
		return this.estadoService.save(s);
	}
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") int stateId) {
		return this.estadoService.delete(stateId);
	}
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Estado state) {
		return this.estadoService.delete(state);
	}
}
