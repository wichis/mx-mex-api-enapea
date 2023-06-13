package mx.com.ease.sidmea.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="municipios")
public class Municipio {
	@Id 
	@Column(name="id_municipio")
	private Integer id;
	
	private String nombre;
	
	@Column(name="nombre_corto")
	private String nombreCorto;
	
	/*@Column(name="id_estado")
	private Integer idEstado;
	@ManyToOne
	@JoinColumn(name="id_estado", insertable=false, updatable=false)
	private Estado estado;*/
	
	@Column(name="id_region")
	private Integer idRegion;
	@ManyToOne
	@JoinColumn(name="id_region", insertable=false, updatable=false)
	private Regioncita region;
	
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
	/*public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}*/
	public Integer getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}
}
