package ar.edu.unlam.pb2.Parcial1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class PersonaTest {
	@Test
	public void sePudoCrearUnClienteMayorDeEdad() {
		Persona cliente1 = new Cliente("Pedro", "Sánchez", 400, 51, TipoCliente.VIP, true);
		assertNotNull(cliente1);
	}
	

	@Test
	public void sePudoCrearUnClienteMenorDeEdad() {
		Persona cliente2 = new Cliente("Lucas", "Sabela", 6400, 12, TipoCliente.STANDARD, true);
		assertNotNull(cliente2);
	}
	
	
	@Test
	public void clienteCompraEntrada() {
		Persona cliente1 = new Cliente("Pedro", "Sánchez", 400, 51, TipoCliente.VIP, true);
		Boolean valorEsperado = true;
		Boolean valorObtenido = cliente1.comprarEntrada();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void clienteCompraCombo() {
		Persona cliente1 = new Cliente("Pedro", "Sánchez", 400, 51, TipoCliente.VIP, true);
		Boolean valorEsperado = true;
		Boolean valorObtenido = cliente1.comprarCombo();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	/* En este caso particular de diseño es imposible que el cliente no pueda comprar un combo*/
		
	
	@Test
	public void sePudoCrearEmpleadoFrontDeskDelCine() {
		PersonalFront empleado1 = new PersonalFront("Luis", "Gómez", 600, 43);
		assertNotNull(empleado1);
	}
	
	@Test
	public void sePudoCrearEmpleadoLimpiezaDelCine() {
		Persona empleado2 = new PersonalLimpieza("Gerardo", "Bolañoz", 500, 49);
		assertNotNull(empleado2);
	}
	
	
	@Test
	public void elPersonalDeLimpiezaLimpiaLaSala() {
		PersonalCine empleado2 = new PersonalLimpieza("Luis", "Gómez", 600, 43);
		Boolean valorEsperado = true;
		Boolean valorObtenido = empleado2.limpiarSala();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	/*@Test*/
	/*public void elPersonaldeLimpiezaLimpiaLaSala() {
		PersonalLimpieza empleado2 = new PersonalLimpieza("Luis", "Gómez", 600, 43);
		Boolean valorEsperado = true;
		Boolean valorObtenido = empleado2.limpiarSala();
		assertEquals(valorEsperado, valorObtenido);
	}*/
	
	@Test
	public void elPersonalDeFrontDeskVendeEntrada() {
		PersonalCine empleado1 = new PersonalFront("Luis", "Gómez", 600, 43);
		Boolean valorEsperado = true;
		Boolean valorObtenido = empleado1.venderEntrada();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test
	public void elPersonalDeFrontDeskValidaSiLaSalaEstaDisponible() {
		PersonalCine empleado1 = new PersonalFront("Luis", "Gómez", 600, 43);
		Boolean valorEsperado = true;
		Sala sala = new Sala ("Sala2", TipoSala.SALA_3D);
		Boolean valorObtenido = sala.getSalaDisponible();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void elPersonalDeFrontDeskAsignaUnaSalaAUnaPelicula() {
		PersonalCine empleado1 = new PersonalFront("Luis", "Gómez", 600, 43);
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Sala sala1 = new Sala ("Sala 1", TipoSala.SALA_2D);
		
		sala1.setSalaDisponible(false);
		Boolean valorEsperado = false;
		Boolean valorObtenido = sala1.getSalaDisponible();
		assertEquals(valorEsperado, valorObtenido);
	}

	
	
/*	@Test
	public void elPersonalDeFrontDeskValidaSiLaSalaEstaDisponiblePeroEstaConUnaFuncionEnCurso() {
		PersonalCine empleado1 = new PersonalFront("Luis", "Gómez", 600, 43);
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Boolean valorEsperado = false;
		
		
	}*/
	
	
}