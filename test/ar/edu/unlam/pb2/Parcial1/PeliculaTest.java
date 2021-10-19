package ar.edu.unlam.pb2.Parcial1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PeliculaTest {

	@Test
	public void sePudoCrearUnaPelicula() {
		String nombre = "Rambo";
		TipoGenero genero = TipoGenero.ACCION;
		TipoClasificacion clasificacion = TipoClasificacion.MAYORES_16;
		Pelicula pelicula = new Pelicula(nombre, genero, clasificacion);
		assertNotNull(pelicula);
	}

	@Test
	public void sePuedeSaberElNombreDeLaPelicula() {
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		String valorEsperado = "Rambo";
		String valorObtenido = pelicula.getTitulo();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void noSePudoSaberElNombreDeLaPeliculaPorqueEstaNoExiste() {
		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		String valorEsperado = "Rambo";
		String valorObtenido = pelicula.getTitulo();
		assertNotEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void sePuedeSaberLaClasificacionDeLaPelicula() {
		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		TipoClasificacion valorEsperado = TipoClasificacion.MAYORES_16;
		TipoClasificacion valorObtenido = pelicula.getClasificacion();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void noSePuedeSaberLaClasificacionDeLaPeliculaPorqueLaMismaNoEsATP() {
		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		TipoClasificacion valorEsperado = TipoClasificacion.ATP;
		TipoClasificacion valorObtenido = pelicula.getClasificacion();
		assertNotEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void sePuedeSaberElGeneroDeLaPelicula() {
		Pelicula pelicula = new Pelicula("Rapido y Furioso", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		TipoGenero valorEsperado = TipoGenero.ACCION;
		TipoGenero valorObtenido = pelicula.getGenero();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void noSePuedeSaberElGeneroDeLaPeliculaPorqueElGeneroNoEsElEsperado() {
		Pelicula pelicula = new Pelicula("Rapido y Furioso", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		TipoGenero valorEsperado = TipoGenero.FICCION;
		TipoGenero valorObtenido = pelicula.getGenero();
		assertNotEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void sePudoObtenerElDiaDeLaPelicula() {
		Pelicula pelicula = new Pelicula("Rapido y Furioso", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Sala sala = new Sala("sala 1", TipoSala.SALA_2D);
		Entrada entrada = new Entrada(10.0, "18:00", "Martes", pelicula, sala);
		String valorEsperado = "Martes";
		String valorObtenido = pelicula.getDia();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void noSePudoObtenerElDiaDeLaPeliculaPorqueDifiereElDiaQueSeDeseaAnalizar() {
		Pelicula pelicula = new Pelicula("Rapido y Furioso", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Sala sala = new Sala("sala 1", TipoSala.SALA_2D);
		Entrada entrada = new Entrada(10.0, "18:00", "Martes", pelicula, sala);
		String valorEsperado = "Miercoles";
		String valorObtenido = pelicula.getDia();
		assertNotEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void sePudoObtenerElHorarioDeLaPelicula() {
		Pelicula pelicula = new Pelicula("Rapido y Furioso", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Sala sala = new Sala("sala 1", TipoSala.SALA_2D);
		Entrada entrada = new Entrada(10.0, "18:00", "Martes", pelicula, sala);
		String valorEsperado = "18:00";
		String valorObtenido = pelicula.getHora();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void noSePudoObtenerElHorarioDeLaPelicula() {
		Pelicula pelicula = new Pelicula("Rapido y Furioso", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Sala sala = new Sala("sala 1", TipoSala.SALA_2D);
		Entrada entrada = new Entrada(10.0, "18:00", "Martes", pelicula, sala);
		String valorEsperado = "19:00";
		String valorObtenido = pelicula.getHora();
		assertNotEquals(valorEsperado, valorObtenido);
	}

}
