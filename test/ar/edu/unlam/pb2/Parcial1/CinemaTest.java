package ar.edu.unlam.pb2.Parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CinemaTest {

	@Test
	public void sePuedeCrearUnCine() {
		Cine cine = new Cine("ShowCase", 10, 3, 3);

		assertNotNull(cine);
	}

	@Test
	public void sePuedeAgregarPersonalAlCine() {
		Cine cine = new Cine("ShowCase", 10, 3, 3);
		Persona persona = new Persona("Tomas", "Vazquez", 45, 18);
		
		Boolean valorEsperado = true;
		
		Boolean valorObtenido = cine.agregarPersona(persona);
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

	@Test
	public void elClienteVipTieneDescuento() {

	}

	@Test
	public void elClienteVipTieneDescuentoEspecialASalaMax() {

	}

	@Test
	public void elClienteMenorDeEdadNoPuedeComprarEntradaParaPeliculaNoATP() {
		String nombre = "Showcase";
		Integer cantidadPersonas = 10, cantidadSalas = 3, cantidadPeliculas = 3;
		Cine cine = new Cine("ShowCase", cantidadPersonas, cantidadSalas, cantidadPeliculas);
		Cliente cliente = new Cliente("Juan", "Gonzalez", 18908287, 13, TipoCliente.STANDARD, false);
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Boolean valorEsperado = false;
		Boolean valorObtenido = cine.comprarEntrada(cliente, pelicula);
		assertEquals(valorEsperado,valorObtenido);	
	}

	@Test
	public void sePuedeAgregarPelicula() {
		Cine cine = new Cine("ShowCase", 10, 3, 3);
		Pelicula pelicula = new Pelicula("harry Potter", TipoGenero.ACCION, TipoClasificacion.ATP);
		
		Boolean valorEsperado = true;
		
		Boolean valorObtenido = cine.agregarPelicula(pelicula);
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void elMiercolesHayDescuento() {
		String nombre = "Showcase", dia = "Miercoles";
		Integer cantidadPersonas = 10, cantidadSalas = 3, cantidadPeliculas = 3;
		Cine cine = new Cine("ShowCase", cantidadPersonas, cantidadSalas, cantidadPeliculas);
		Boolean valorEsperado = true;
		Boolean valorObtenido = cine.evaluarSiHayDescuento(dia);
		assertEquals (valorEsperado, valorObtenido);
	}

	@Test
	public void elJuevesLaEntradaSaleMasCaraPorSerDiaDeEstreno() { 
		String nombre = "Showcase", dia = "Jueves";
		Double valorEntrada = 100.0;
		Integer cantidadPersonas = 10, cantidadSalas = 3, cantidadPeliculas = 3;
		Cine cine = new Cine("ShowCase", cantidadPersonas, cantidadSalas, cantidadPeliculas);
		Double valorEsperado = 110.0;
		Double valorObtenido = cine.incrementarElValorDeEntrada(valorEntrada,dia);
		assertEquals (valorEsperado, valorObtenido);
	}
	
	@Test
	public void sePuedeAgregarSalas() {
		Cine cine = new Cine("ShowCase", 10, 3, 3);
		Sala sala = new Sala("5", TipoSala.SALA_2D);
		
		Boolean valorEsperado = true;
		
		Boolean valorObtenido = cine.agregarSala(sala);
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
