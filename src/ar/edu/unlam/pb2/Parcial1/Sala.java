package ar.edu.unlam.pb2.Parcial1;

public class Sala {

	private String nombre;
	Boolean estadoLimpia, salaDisponible;
	TipoSala tipoDeSala;
	private final Integer CANTIDAD_DE_FILAS = 25, CANTIDAD_DE_COLUMNAS =18;
	private Integer [][] asiento;

	public Sala(String nombre, TipoSala tipoDeSala) {
		this.nombre = nombre;
		this.tipoDeSala = tipoDeSala;
		this.salaDisponible = true;
		this.estadoLimpia = true;
		this.asiento = new Integer [CANTIDAD_DE_FILAS][CANTIDAD_DE_COLUMNAS];
	}

	public Integer[][] getAsiento() {
		return asiento;
	}

	public void setAsiento(Integer[][] asiento) {
		this.asiento = asiento;
	}

	public Boolean getSalaDisponible() {
		return salaDisponible;
	}

	public void setSalaDisponible(Boolean salaDisponible) {
		this.salaDisponible = salaDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstadoLimpia() {
		return estadoLimpia;
	}

	public void setEstadoLimpia(Boolean estadoLimpia) {
		this.estadoLimpia = estadoLimpia;
	}

	public TipoSala getTipoDeSala() {
		return tipoDeSala;
	}

	public void setTipoDeSala(TipoSala tipoDeSala) {
		this.tipoDeSala = tipoDeSala;
	}

	public Boolean disponibilidadDeLaSala(TipoSala tipoDeSala, String horario, String dia, Pelicula pelicula) {
		Boolean estaDisponible = false;
		if (tipoDeSala.equals(pelicula.getSala()) && pelicula.getDia().equals(dia)
				&& pelicula.getHorario().equals(horario) || estadoLimpia == false) {
			salaDisponible = false;
			estadoLimpia = false;
			return false;
		}
		return true;
	}
	
	
}
