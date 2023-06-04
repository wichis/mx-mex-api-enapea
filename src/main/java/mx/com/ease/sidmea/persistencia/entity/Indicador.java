package mx.com.ease.sidmea.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="indicadores")
public class Indicador {
	@Id
	@Column(name="id_indicador")
	private Integer id;
	
	@Column(name="id_componente")
	private Integer idComponente;
	@ManyToOne
	@JoinColumn(name="id_componente", insertable=false, updatable=false)
	private Componente componente;
	
	@Column(name="id_subcomponente")
	private Integer idSubComponente;
	@ManyToOne
	@JoinColumn(name="id_subcomponente", insertable=false, updatable=false)
	private SubComponente subComponente;
	
	@Column(name="id_nivel")
	private Integer idNivel;
	@ManyToOne
	@JoinColumn(name="id_nivel", insertable=false, updatable=false)
	private Nivel nivel;
	
	@Column(name="cve_indicador")
	private String cveIndicador;
	
	private String nombre;
	private String proposito;
	private String definicion;
	private String formula;
	private String dimension;
	private String tipo;
	private String periodicidad;
	private String fuente;
	private String responsable; 
	private String notas;
	
	@Column(name="tipo_de_meta")
	private String tipoMeta;
	@Column(name="unidad_de_medida")
	private String unidadMedida;
	@Column(name="por_sexo")
	private Boolean porSexo;
	@Column(name="por_edad")
	private Boolean porEdad;
	@Column(name="anyo2012")
	private Boolean year2012;
	@Column(name="url_servicio")
	private String urlServicio;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(Integer idComponente) {
		this.idComponente = idComponente;
	}
	public Componente getComponente() {
		return componente;
	}
	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	public Integer getIdSubComponente() {
		return idSubComponente;
	}
	public void setIdSubComponente(Integer idSubComponente) {
		this.idSubComponente = idSubComponente;
	}
	public SubComponente getSubComponente() {
		return subComponente;
	}
	public void setSubComponente(SubComponente subComponente) {
		this.subComponente = subComponente;
	}
	public Integer getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(Integer idNivel) {
		this.idNivel = idNivel;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public String getCveIndicador() {
		return cveIndicador;
	}
	public void setCveIndicador(String cveIndicador) {
		this.cveIndicador = cveIndicador;
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
	public String getDefinicion() {
		return definicion;
	}
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public String getTipoMeta() {
		return tipoMeta;
	}
	public void setTipoMeta(String tipoMeta) {
		this.tipoMeta = tipoMeta;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Boolean getPorSexo() {
		return porSexo;
	}
	public void setPorSexo(Boolean porSexo) {
		this.porSexo = porSexo;
	}
	public Boolean getPorEdad() {
		return porEdad;
	}
	public void setPorEdad(Boolean porEdad) {
		this.porEdad = porEdad;
	}
	public Boolean getYear2012() {
		return year2012;
	}
	public void setYear2012(Boolean year2012) {
		this.year2012 = year2012;
	}
	public String getUrlServicio() {
		return urlServicio;
	}
	public void setUrlServicio(String urlServicio) {
		this.urlServicio = urlServicio;
	}
}
