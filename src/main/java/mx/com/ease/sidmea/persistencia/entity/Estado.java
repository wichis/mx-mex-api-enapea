package mx.com.ease.sidmea.persistencia.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="estados")
public class Estado {
	@Id
	@Column(name="id_estado")
	private Integer id;
	
	private String nombre;
	@Column(name="nombre_corto")
	private String nombreCorto;
	
	@OneToMany(mappedBy="estado")
	private List<Regioncita> regiones;
	
	/*@OneToMany(mappedBy="estado")
	private List<Municipio> municipios;*/
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
}