package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario extends Persona {

	private double credito;
	private List<CompraLibro> compraLibros;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(double credito) {
		super();
		this.credito = credito;
		this.compraLibros = new ArrayList<>();

	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public List<CompraLibro> getCompraLibros() {
		return compraLibros;
	}

	public void setCompraLibros(List<CompraLibro> compraLibros) {
		this.compraLibros = compraLibros;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"credito=" + credito +
				", compraLibros=" + compraLibros +
				'}';
	}

	public void incrementarCredito(double credito) {
		this.credito = Math.round((this.credito + credito)*100)/100;
	}

	public void decrementarCredito(double credito) {
		this.credito = Math.round((this.credito - credito)*100)/100;
	}


	public void addCompraLibros(Date fecha, double precioTotal, Impreso impreso, Digital digital) {
		CompraLibro bS= new CompraLibro(fecha, precioTotal, impreso, digital);

		compraLibros.add(bS);
	}
}
