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

import mx.com.ease.sidmea.domain.service.IndicadorService;
import mx.com.ease.sidmea.persistencia.entity.Indicador;
import mx.com.ease.sidmea.persistencia.entity.SubComponente;

@RestController
@RequestMapping("/indicadores")
public class IndicadorController {
	@Autowired
	private IndicadorService servicio;
	
	@GetMapping("all")
	public List<Indicador> getAll() {
		return this.servicio.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Indicador> getIndicador(@PathVariable("id") int indicadorId){
		return this.servicio.getIndicador(indicadorId);
	}
	
	@PostMapping("/save")
	public Indicador save(@RequestBody Indicador indicador) {
		return this.servicio.save(indicador);
	}
	
	@GetMapping("/componente/{idComponente}")
	public Optional<List<Indicador>> getByComponente(@PathVariable("idComponente")int componenteId){
		return this.servicio.getByComponente(componenteId);
	}
	
	@GetMapping("/subcomponente/{idSubComponente}")
	public Optional<List<Indicador>> getBySubComponente(@PathVariable("idSubComponente")int subcomponenteId){
		return this.servicio.getByComponente(subcomponenteId);
	}
	
	@GetMapping("/nivel/{idNivel}")
	public Optional<List<Indicador>> getByNivel(@PathVariable("idNivel")int nivelId){
		return this.servicio.getByNivel(nivelId);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int nivelId) {
		return this.servicio.delete(nivelId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Indicador indicador) {
		return this.servicio.delete(indicador);
	}
}
