package ar.edu.unlam.pb2.Parcial1;

public class PersonalFront extends PersonalCine{
	public PersonalFront (String nombre, String apellido, Integer dni, Integer edad) {
		super(nombre, apellido, dni, edad);	
   }

	@Override
	public Boolean venderEntrada() {
		return true;
	}
	
}
