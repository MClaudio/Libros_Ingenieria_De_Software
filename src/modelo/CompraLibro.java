package modelo;

import java.util.Date;
import java.util.List;

public class CompraLibro {

	private Date fecha;
	private double precioTotal;
	private Digital digital;
	private Impreso impreso;

	public CompraLibro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompraLibro(Date fecha, double precioTotal, Impreso impreso, Digital digital) {
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.digital = digital;
		this.impreso = impreso;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Digital getDigital() {
		return digital;
	}

	public void setDigital(Digital digital) {
		this.digital = digital;
	}

	public Impreso getImpreso() {
		return impreso;
	}

	public void setImpreso(Impreso impreso) {
		this.impreso = impreso;
	}

	@Override
	public String toString() {
		return "CompraLibro{" +
				"fecha=" + fecha +
				", precioTotal=" + precioTotal +
				", digital=" + digital +
				", impreso=" + impreso +
				'}';
	}
}
