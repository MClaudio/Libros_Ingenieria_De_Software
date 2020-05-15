package modelo;

import java.util.List;

public class Autor extends Persona {

	private String nacionalidad;
	

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autor(String nacionalidad) {
		super();
		this.nacionalidad = nacionalidad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Autor [nacionalidad=" + nacionalidad + "]";
	}



}
