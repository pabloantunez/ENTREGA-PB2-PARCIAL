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

	public Boolean agregarPersona(Persona persona) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i] == null) {
				personas[i] = persona;
				sePudoAgregar = true;
				break;

			}
		}
		return sePudoAgregar;
	}

	public Boolean agregarPelicula(Pelicula pelicula) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < this.pelicula.length; i++) {
			if (this.pelicula[i] == null) {
				this.pelicula[i] = pelicula;
				sePudoAgregar = true;
				break;
			}

		}
		return sePudoAgregar;
	}

	public Boolean agregarSala(Sala sala) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < this.salas.length; i++) {
			if (this.salas[i] == null) {
				this.salas[i] = sala;
				sePudoAgregar = true;
				break;
			}

		}
		return sePudoAgregar;
	}
	
	public Boolean evaluarCondicionCliente(Cliente cliente) {
		Boolean resultado = false;
		
		if (cliente.getTipoDeCliente().equals(TipoCliente.VIP) && (cliente.getMensualidadActiva() == true)) {
			resultado = true;
			return resultado;
		}
		return resultado;
	}

	public Double aplicarDto(Double valorEntrada, Cliente cliente1) {
		
		Double precioConDto = 0.0;
		
		if (evaluarCondicionCliente(cliente1)==true) {
			precioConDto = valorEntrada * 0.9;
			return precioConDto;
		}
		return valorEntrada;
	}

	

}
