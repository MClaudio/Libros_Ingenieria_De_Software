package modelo;

public abstract class Libro {

	private int id;
	private String titulo;
	private String edicion;
	private double precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double calcularCosto() {
		return this.precio + calcularComision();
	}

	public abstract double calcularComision();
	
	

}
