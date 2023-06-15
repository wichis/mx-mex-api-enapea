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

import mx.com.ease.sidmea.domain.service.EtniaService;
import mx.com.ease.sidmea.persistencia.entity.Etnia;

@RestController
@RequestMapping("/etnias")
public class EtniaController {
	@Autowired
	private EtniaService etniaService;
	
	@GetMapping("all")
	public List<Etnia> getAll() {
		return this.etniaService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Etnia> getEtnia(@PathVariable("id") int etniaId){
		return this.etniaService.getEtnia(etniaId);
	}
	
	@PostMapping("/save")
	public Etnia save(@RequestBody Etnia e) {
		return this.etniaService.save(e);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") int etniaId) {
		return this.etniaService.delete(etniaId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Etnia etnia) {
		return this.etniaService.delete(etnia);
	}
}
