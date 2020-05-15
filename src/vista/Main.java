package vista;

import java.util.Date;

import modelo.*;
import modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usu = new Usuario(100.00);
		usu.setId(1);
		usu.setNombre("Claudio");
		usu.setApellido("Duchimaza");
		usu.setEdad(21);
		System.out.println("Usuario " + usu.getNombre()+ " Credito " +usu.getCredito() +" Edad: " +usu.getEdad());

		System.out.println("======================================================");

		Autor autor = new Autor("Venezolano");
		autor.setId(1);
		autor.setNombre("Jonnathan");
		autor.setApellido("Ochoa");
		autor.setEdad(30);
		System.out.println("Autor " + autor.getNombre()+" Nacionalidad: "+autor.getNacionalidad());

		System.out.println("=================LIBROS=========================");

		Impreso impreso = new Impreso(autor);
		impreso.setId(1);
		impreso.setTitulo("Un viaje al centro de la tierra");
		impreso.setEdicion("Julio Berne 1950");
		impreso.setPrecio(30);
		System.out.println("Libro impreso: "+impreso.getTitulo()+" Precio: "+impreso.getPrecio()+" Autor: "+impreso.getAutor().getNombre());

		Digital digital = new Digital(autor);
		digital.setId(1);
		digital.setTitulo("Romeo y Julieta");
		digital.setEdicion("Vanguardista Primera Edicion 1940");
		digital.setPrecio(20);
		System.out.println("Libro digital: "+digital.getTitulo()+" Precio: "+digital.getPrecio()+" Autor: "+digital.getAutor().getNombre());

		System.out.println("================COMPRA 1=================");

		System.out.println("Costo del libro impreso: " +impreso.getPrecio());
		System.out.println("Saldo actual del usuario: " +usu.getCredito());
		usu.addCompraLibros(new Date(), impreso.calcularCosto(), impreso, null);
		usu.decrementarCredito(impreso.calcularCosto());
		System.out.println("Costo de compra: " + impreso.calcularCosto() +" Saldo usuario: "+  usu.getCredito());

		System.out.println("=================COMPRA 2===================");

		System.out.println("Costo del libro digital: " +digital.getPrecio());
		System.out.println("Saldo actual del usuario: " +usu.getCredito());
		usu.addCompraLibros(new Date(), digital.calcularCosto(), null, digital);
		usu.decrementarCredito(digital.calcularCosto());
		System.out.println("Costo de compra: " + digital.calcularCosto() +" Saldo usuario: "+  usu.getCredito());

		System.out.println("=================MIS LIBROS====================");
		for (CompraLibro cl:usu.getCompraLibros()){

			if (cl.getImpreso() != null){

				System.out.println("Fecha: "+cl.getFecha()+" | Libro Impreso: "+cl.getImpreso().getTitulo()+" | Precio total: "+cl.getPrecioTotal());

			}else if (cl.getDigital() != null){

				System.out.println("Fecha: "+cl.getFecha()+" | Libro Digital: "+cl.getDigital().getTitulo()+" | Precio total: "+cl.getPrecioTotal());

			}

		}
		System.out.println("=================RECARGA DE SALDO====================");
		System.out.println("Saldo Anterior: "+usu.getCredito());
		usu.incrementarCredito(50);
		System.out.println("Nuevo saldo: "+usu.getCredito());

	}

}
