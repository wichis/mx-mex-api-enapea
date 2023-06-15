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

import mx.com.ease.sidmea.domain.service.NivelEducativoService;
import mx.com.ease.sidmea.persistencia.entity.Etnia;
import mx.com.ease.sidmea.persistencia.entity.NivelEducativo;

@RestController
@RequestMapping("/niveles_educativos")
public class NivelEducativoController {
	@Autowired
	private NivelEducativoService nivelService;
	
	@GetMapping("all")
	public List<NivelEducativo> getAll(){
		return this.nivelService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<NivelEducativo> getNivelEducativo(@PathVariable("id") int nivelId){
		return this.nivelService.getNivelEducativo(nivelId);
	}
	
	@PostMapping("/save")
	public NivelEducativo save(@RequestBody NivelEducativo nivel) {
		return this.nivelService.save(nivel);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") int nivelId) {
		return this.nivelService.delete(nivelId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody NivelEducativo nivel) {
		return this.nivelService.delete(nivel);
	}
}
