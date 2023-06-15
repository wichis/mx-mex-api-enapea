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

import mx.com.ease.sidmea.domain.service.RangoDeEdadService;
import mx.com.ease.sidmea.persistencia.entity.RangoDeEdad;

@RestController
@RequestMapping("/rangos_edad")
public class RangoDeEdadController {
	@Autowired
	private RangoDeEdadService rangoService;
	
	@GetMapping("all")
	public List<RangoDeEdad> getAll(){
		return this.rangoService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<RangoDeEdad> getRangoDeEdad(@PathVariable("id") int rangoId){
		return this.rangoService.getRangoDeEdad(rangoId);
	}
	
	@PostMapping("/save")
	public RangoDeEdad save(@RequestBody RangoDeEdad rango) {
		return this.rangoService.save(rango);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") int rangoId) {
		return this.rangoService.delete(rangoId);
	}
	
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody RangoDeEdad rango) {
		return this.rangoService.delete(rango);
	}
}
