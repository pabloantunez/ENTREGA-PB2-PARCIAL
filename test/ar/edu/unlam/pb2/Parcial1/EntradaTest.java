package ar.edu.unlam.pb2.Parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EntradaTest {

	@Test
	public void sePuedeCrearLaClaseEntrada() {
		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";
		// meter por marametros la sala y la pelicula;
		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);

		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		assertNotNull(entrada);
	}

	@Test
	public void sePuedeSaberLaDisponibilidadDeLaButacaYEstaEstaLibre() {
		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";

		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);


		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		Boolean valorEsperado = true;

		Boolean valorObtenido = entrada.estadoButaca(fila, butaca);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void poderReservarUnaButaca() {
		// � asignar

		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";

		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);


		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		Boolean valorEsperado = true;

		Boolean valorObtenido = entrada.asignarAsiento(fila, butaca);

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void noPoderReservarButacaPorqueEstaOcupada() {

		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";

		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);

		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		Boolean valorEsperado = false;

		entrada.asignarAsiento(fila, butaca);

		Boolean valorObtenido = entrada.asignarAsiento(fila, butaca);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void poderSaberQuePeliculaVoyAVerEnLaEntrada() {
		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";

		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);


		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		// compatibilizar

		String valorEsperado = "Harry Potter";

		String valorobtenido = entrada.getPelicula();

		assertEquals(valorEsperado, valorobtenido);
	}

	@Test
	public void poderSaberLaSalaEnDondeVoyAVerMiPelicula() {
		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";

		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);

		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		String valorEsperado = "2";

		String valorobtenido = entrada.getNombreSala();

		assertEquals(valorEsperado, valorobtenido);
	}

	@Test
	public void poderSaberEnQueTipoDeSalaEstaMiEntrada() {

		Double precio = 100.0, hora = 14.00;
		Integer fila = 20, butaca = 10;
		String dia = "jueves";

		Pelicula pelicula = new Pelicula("Harry Potter", TipoGenero.FICCION, TipoClasificacion.ATP, "Lunes", "14:00", TipoSala.SALA_2D);


		Sala sala = new Sala("2", TipoSala.SALA_3D);

		Entrada entrada = new Entrada(precio, hora, dia, pelicula, sala);

		TipoSala valorEsperado = TipoSala.SALA_3D;

		TipoSala valorObtenido = entrada.getTipoSala();

		assertEquals(valorEsperado, valorObtenido);
	}

}
