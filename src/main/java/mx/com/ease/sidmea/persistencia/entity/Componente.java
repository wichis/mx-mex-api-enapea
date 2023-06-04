package mx.com.ease.sidmea.persistencia.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="componentes")
public class Componente {
	@Id
	@Column(name="id_componente")
	private Integer idComponente;
	
	@Column(name="cve_componente")
	private String cveComponente;
	@Column(name="nombre_corto")
	private String nombreCorto;
	
	private String nombre;
	private String proposito;
	
	@OneToMany(mappedBy="componente")
	private List<Indicador> indicadores;
	@OneToMany(mappedBy="componente")
	private List<SubComponente> subcomponentes;
	
	public Integer getIdComponente() {
		return idComponente;
	}
	public void setId(Integer id) {
		this.idComponente = id;
	}
	public String getCveComponente() {
		return cveComponente;
	}
	public void setCveComponente(String cveComponente) {
		this.cveComponente = cveComponente;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProposito() {
		return proposito;
	}
	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
}