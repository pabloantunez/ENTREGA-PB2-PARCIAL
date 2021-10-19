package ar.edu.unlam.pb2.Parcial1;

public class Cine {

	private String nombre;
	private Persona[] personas;
	private Sala[] salas;
	private Pelicula[] pelicula;
	private Entrada entrada;
	private String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

	public Cine(String nombre, Integer cantPersonas, Integer cantSalas, Integer cantPeliculas) {
		this.nombre = nombre;
		this.personas = new Persona[cantPersonas];
		this.salas = new Sala[cantSalas];
		this.pelicula = new Pelicula[cantPeliculas];
	}

	public Boolean evaluarSiHayDescuento(String dia) {
		Boolean hayDescuento = false;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i].equals(dia)) {
				hayDescuento = true;
				return hayDescuento;
			} 
		}
		return hayDescuento;
	}
}
