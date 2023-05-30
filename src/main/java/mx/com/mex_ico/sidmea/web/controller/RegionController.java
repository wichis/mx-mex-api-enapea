package mx.com.mex_ico.sidmea.web.controller;

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

import mx.com.mex_ico.sidmea.domain.service.RegioncitaService;
import mx.com.mex_ico.sidmea.persistencia.entity.Regioncita;

@RestController
@RequestMapping("/regiones")
public class RegionController {
	@Autowired
	private RegioncitaService regionService;
	
	@GetMapping("all")
	public List<Regioncita> getAll(){
		return this.regionService.getAll();
	}
	@GetMapping("/{id}")
	public Optional<Regioncita> getRegion(@PathVariable("id") int idRegion){
		return this.regionService.getRegioncita(idRegion);
	}
	@GetMapping("/estado/{idEstado}")
	public Optional<List<Regioncita>> getByState(@PathVariable("idEstado") int stateId){
		return this.regionService.getByState(stateId);
	}
	@PostMapping("/save")
	public Regioncita save(@RequestBody Regioncita reg) {
		return this.regionService.save(reg);
	}
	@DeleteMapping("/borrar")
	public boolean delete(@RequestBody Regioncita reg) {
		return this.regionService.delete(reg);
	}
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int regionId) {
		return this.regionService.delete(regionId);
	}
}
