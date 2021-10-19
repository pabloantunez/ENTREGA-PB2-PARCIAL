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
	public void sePuedeAgregarPersonalAlCine() { // TOMI

	}

	@Test
	public void elClienteVipTieneDescuento() { // VIR

	}

	@Test
	public void elClienteVipTieneDescuentoEspecialASalaMax() {

	}

	@Test
	public void elClienteMenorDeEdadNoPuedeComprarEntradaParaPeliculaNoATP() { // PABLO

	}

	@Test
	public void sePuedeAgregarPelicula() {

	}

	@Test
	public void elMiercolesHayDescuento() { // PABLO
		String nombre = "Showcase", dia = "Miercoles";
		Integer cantidadPersonas = 10, cantidadSalas = 3, cantidadPeliculas = 3;
		Cine cine = new Cine("ShowCase", cantidadPersonas, cantidadSalas, cantidadPeliculas);
		Boolean valorEsperado = true;
		Boolean valorObtenido = cine.evaluarSiHayDescuento(dia);
		assertEquals (valorEsperado, valorObtenido);
	}
	
	@Test
	public void elJuevesLaEntradaSaleMasCaraPorSerDiaDeEstreno() { // PABLO
		String nombre = "Showcase", dia = "Jueves";
		Double valorEntrada = 100.0;
		Integer cantidadPersonas = 10, cantidadSalas = 3, cantidadPeliculas = 3;
		Cine cine = new Cine("ShowCase", cantidadPersonas, cantidadSalas, cantidadPeliculas);
		Double valorEsperado = 110.0;
		Double valorObtenido = cine.incrementarElValorDeEntrada();
		assertEquals (valorEsperado, valorObtenido);
	}

	@Test
	public void sePuedeAgregarSalas() {

	}

}
