package ar.edu.unlam.pb2.Parcial1;


public class PersonalLimpieza extends PersonalCine {
	private Sala sala;

	
	public PersonalLimpieza (String nombre, String apellido, Integer dni, Integer edad) {
		super(nombre, apellido, dni, edad);	
		this.sala = new Sala ("Sala1", TipoSala.SALA_2D);
	}
	
	public Boolean limpiarSala() {
		sala.setEstadoLimpia(true);
		return sala.getEstadoLimpia();
	}
}
