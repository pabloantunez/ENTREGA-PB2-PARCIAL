package ar.edu.unlam.pb2.Parcial1;

public class Entrada {
	private final Integer CANTIDAD_FILAS = 25;
	private final Integer CANTIDAD_BUTACAS_POR_FILA = 18;
	private Double precio;
	private Boolean[][] asientos;
	private Double hora;
	private String dia;
	
	private Pelicula pelicula;
	private Sala sala;

	public Entrada(Double precio, Double hora, String dia, Pelicula pelicula, Sala sala) {
		this.precio = precio;
		this.asientos = new Boolean[CANTIDAD_FILAS][CANTIDAD_BUTACAS_POR_FILA];
		this.hora = hora;
		this.dia = dia;
		this.pelicula = pelicula;
		this.sala = sala;
	}

	public Boolean estadoButaca(Integer fila, Integer butaca) {
		// false = ocupado
		Boolean estadoDeLaButaca = false;
		if (asientos[fila][butaca] == null || asientos[fila][butaca] == false) {
			estadoDeLaButaca = true;
		}
		return estadoDeLaButaca;
	}

	public Boolean asignarAsiento(Integer fila, Integer butaca) {
		Boolean estadoDeAsignacion = false;
		if (estadoButaca(fila, butaca)) {
			asientos[fila][butaca] = true;
			estadoDeAsignacion = true;
		}

		return estadoDeAsignacion;
	}

	public String getPelicula() {
		return pelicula.getTitulo();
	}

	public String getNombreSala() {
		return this.sala.getNombre();
	}

	public TipoSala getTipoSala() {
		return sala.getTipoDeSala();
	}
}
