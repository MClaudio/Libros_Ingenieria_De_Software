package modelo;

public class Digital extends Libro {
	
	private Autor autor;

	public Digital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Digital(Autor autor) {
		super();
		this.autor = autor;
	}

	@Override
	public double calcularComision() {

		return this.getPrecio() * 0.50;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
