package ar.edu.unlam.pb2.Parcial1;

public class PersonalCine extends Persona implements Limpiador, Vendedor {
	
	public PersonalCine (String nombre, String apellido, Integer dni, Integer edad) {
		super(nombre, apellido, dni, edad);	
	}
	
	
	
	@Override
	public Boolean limpiarSala() {
		return null;
	}
	
	@Override
	public Boolean venderEntrada() {
		return true;
	}

}
