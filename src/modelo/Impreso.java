package modelo;

public class Impreso extends Libro {
	
	private Autor autor;

	public Impreso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Impreso(Autor autor) {
		super();
		this.autor = autor;
	}

	@Override
	public double calcularComision() {
		return (this.getPrecio() * 0.02) + 20;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
