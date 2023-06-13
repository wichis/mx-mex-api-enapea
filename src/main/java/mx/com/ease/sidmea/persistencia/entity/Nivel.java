package mx.com.ease.sidmea.persistencia.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="nivelesdedesagregacionteritorial")
public class Nivel {
	@Id
	@Column(name="id_nivel")
	private Integer id;
	private String cve;
	private String nombre;
	
	@OneToMany(mappedBy="nivel")
	private List<Indicador> indicadores;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCve() {
		return cve;
	}

	public void setCve(String cve) {
		this.cve = cve;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
