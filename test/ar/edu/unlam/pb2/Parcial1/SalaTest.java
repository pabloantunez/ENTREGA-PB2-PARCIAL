package ar.edu.unlam.pb2.Parcial1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SalaTest {

	@Test
	public void sePudoCrearUnaSalaEnElCine() {
		String nombre = "sala1";
		TipoSala tipoDeSala = TipoSala.SALA_2D;
		Sala sala = new Sala(nombre, tipoDeSala);
		assertNotNull(sala);
	}

	@Test
	public void siLaSalaNoFueUsadaEstaDisponible() {
		String horario = "20", dia = "miercoles";
		Sala sala = new Sala("sala1", TipoSala.SALA_2D);
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Entrada entrada = new Entrada(10.0, "18:00", "Martes", pelicula, sala);
		Boolean valorEsperado = true;
		Boolean valorObtenido = sala.disponibilidadDeLaSala(sala.getTipoDeSala(), horario, dia, pelicula);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void siLaSalaFueUsadaCambiaSuEstadoASuciaYNoEstaDisponible() {
		String horario = "18", dia = "martes";
		Sala sala = new Sala("sala1", TipoSala.SALA_2D);
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Boolean valorEsperado = false;
		Boolean valorObtenido = sala.disponibilidadDeLaSala(sala.getTipoDeSala(), horario, dia, pelicula);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void siLaSalaEstaSuciaNoEstaDisponible() {
		String horario = "20", dia = "martes";
		Sala sala = new Sala("sala1", TipoSala.SALA_2D);
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		sala.setEstadoLimpia(false);
		Boolean valorEsperado = false;
		Boolean valorObtenido = sala.disponibilidadDeLaSala(sala.getTipoDeSala(), horario, dia, pelicula);
		assertEquals(valorEsperado, valorObtenido);
	}
}
