package chamorro.edisson.mvc.modelo;

public class Productos {

	private String codigoArticulo;
	private String nombreArticulo;
	private String secccionArticulo;
	private String descripcionArticulo;
	private String fechaArticulo;
	private String importadoArticulo;
	private String precioArticulo;

	public Productos() {
		codigoArticulo = "";
		nombreArticulo = "";
		secccionArticulo = "";
		descripcionArticulo = "";
		fechaArticulo = "";
		importadoArticulo = "";
		precioArticulo = "";
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getCodigoSeccion() {
		return nombreArticulo;
	}

	public void setCodigoSeccion(String codigoSeccion) {
		this.nombreArticulo = codigoSeccion;
	}

	public String getCodigoNombre() {
		return secccionArticulo;
	}

	public void setCodigoNombre(String codigoNombre) {
		this.secccionArticulo = codigoNombre;
	}

	public String getCodigoDescripcion() {
		return descripcionArticulo;
	}

	public void setCodigoDescripcion(String codigoDescripcion) {
		this.descripcionArticulo = codigoDescripcion;
	}

	public String getCodigoFecha() {
		return fechaArticulo;
	}

	public void setCodigoFecha(String codigoFecha) {
		this.fechaArticulo = codigoFecha;
	}

	public String getCodigoImportado() {
		return importadoArticulo;
	}

	public void setCodigoImportado(String codigoImportado) {
		this.importadoArticulo = codigoImportado;
	}

	public String getCodigoPrecio() {
		return precioArticulo;
	}

	public void setCodigoPrecio(String codigoPrecio) {
		this.precioArticulo = codigoPrecio;
	}

}
