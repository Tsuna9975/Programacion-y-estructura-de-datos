
public class Pelicula {

	private String nombre;
	private String estudio;
	private String estado;
	private String version;
	private String precio;
	private String tipoPublico;
	private String anioPublicacion;
	private String genero;
	private String publicacionDVD;
	private int id;
	
	public Pelicula(String pNombre,String pEstudio,String pEstado,String pVersion,String pPrecio,String pTipoPublico,String pAnioPublicacion,String pGenero,String pPublicacionDVD,int pId) {
		this.nombre=pNombre;
		this.estudio=pEstudio;
		this.estado=pEstado;
		this.version=pVersion;
		this.precio=pPrecio;
		this.tipoPublico=pTipoPublico;
		this.anioPublicacion=pAnioPublicacion;
		this.genero=pGenero;
		this.publicacionDVD=pPublicacionDVD;
		this.id=pId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getTipoPublico() {
		return tipoPublico;
	}

	public void setTipoPublico(String tipoPublico) {
		this.tipoPublico = tipoPublico;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPublicacionDVD() {
		return publicacionDVD;
	}

	public void setPublicacionDVD(String publicacionDVD) {
		this.publicacionDVD = publicacionDVD;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	
}
