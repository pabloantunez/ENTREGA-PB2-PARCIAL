package ar.edu.unlam.pb2.Parcial1;

public class Pelicula {

	private String titulo, dia, horario;
	private TipoClasificacion clasificacion;
	private TipoGenero genero;
	private TipoSala sala;
	private Entrada entrada;

	public Pelicula(String titulo, TipoGenero genero, TipoClasificacion clasificacion) {
		this.titulo = titulo;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.entrada = new Entrada(null, "titulo", "titulo", null, null);
		this.sala = TipoSala.SIN_ASIGNAR;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public TipoGenero getGenero() {
		return genero;
	}

	public void setGenero(TipoGenero genero) {
		this.genero = genero;
	}

	public TipoSala getSala() {
		return sala;
	}

	public void setSala(TipoSala sala) {
		this.sala = sala;
	}

	public TipoClasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(TipoClasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getHora() {
		return entrada.getHora();
	}

	public String getDia() {
		return entrada.getDia();
	}

	
}
