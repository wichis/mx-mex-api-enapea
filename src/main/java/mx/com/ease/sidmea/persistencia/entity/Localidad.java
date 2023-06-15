package mx.com.ease.sidmea.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="localidades")
public class Localidad {
	@Id
	@Column(name="id_localidad")
	private Integer id;
	
	private String nombre;
	
	@Column(name="nombre_corto")
	private String nombreCorto;
	
	@Column(name="id_municipio")
	private Integer idMunicipio;
	@ManyToOne
	@JoinColumn(name="id_municipio", insertable=false, updatable=false)
	private Municipio municipio;
	
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
	public Integer getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
}