package mx.com.ease.sidmea.persistencia.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="subcomponentes")
public class SubComponente {
	@Id
	@Column(name="id_subcomponente")
	private Integer id;
	
	@Column(name="cve_subcomponente")
	private String cveSubcomponente;
	
	@Column(name="id_padre")
	private Integer idPadre; //Un subcomponente puede ser padre de otro
	
	private String nombre; 
	private String descripcion;
	private String proposito;
	
	//Un subcomponente tiene indicadores (Nombre del atributo en la otra clase)
	@OneToMany(mappedBy="subComponente")
	private List<Indicador> indicadores;
	
	//Los Componentes tienen subcomponentes
	@Column(name="id_componente")
	private Integer idComponente;
	@ManyToOne
	@JoinColumn(name="id_componente", insertable=false, updatable=false)
	private Componente componente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCveSubcomponente() {
		return cveSubcomponente;
	}
	public void setCveSubcomponente(String cveSubcomponente) {
		this.cveSubcomponente = cveSubcomponente;
	}
	public Integer getIdPadre() {
		return idPadre;
	}
	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getProposito() {
		return proposito;
	}
	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
	
	public Integer getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(Integer idComponente) {
		this.idComponente = idComponente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
}
