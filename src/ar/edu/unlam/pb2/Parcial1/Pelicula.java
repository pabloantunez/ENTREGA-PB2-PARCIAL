package ar.edu.unlam.pb2.Parcial1;

public class Pelicula {

	private String titulo, dia, horario;
	private TipoClasificacion clasificacion;
	private TipoGenero genero;
	private TipoSala sala;

	public Pelicula(String titulo, TipoGenero genero, TipoClasificacion clasificacion) {
		this.titulo = titulo;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.dia = null;
		this.horario = null;
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public TipoClasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(TipoClasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Boolean asignarPeliculaASala() {

		return null;
	}
}
