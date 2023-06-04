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

import mx.com.ease.sidmea.domain.service.SubComponenteService;
import mx.com.ease.sidmea.persistencia.entity.SubComponente;

@RestController
@RequestMapping("/subcomponentes")
public class SuComponenteController {
	@Autowired
	private SubComponenteService servicio;
	
	@GetMapping("all")
	public List<SubComponente> getAll() {
		return this.servicio.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<SubComponente> getSubComponente(@PathVariable("id") int subcompoenenteId){
		return this.servicio.getSubComponente(subcompoenenteId);
	}
	
	@PostMapping("/save")
	public SubComponente save(@RequestBody SubComponente sub) {
		return this.servicio.save(sub);
	}
	
	@GetMapping("/componente/{idComponente}")
	public Optional<List<SubComponente>> getByComponente(@PathVariable("idComponente") int componenteId){
		return this.servicio.getByComponente(componenteId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody SubComponente subcomponente) {
		return this.servicio.delete(subcomponente);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int subId) {
		return this.servicio.delete(subId);
	}
}
