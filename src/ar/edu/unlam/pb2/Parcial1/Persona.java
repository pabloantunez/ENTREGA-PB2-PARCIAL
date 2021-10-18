package ar.edu.unlam.pb2.Parcial1;

public class Persona {
	private String nombre, apellido;
	private Integer dni, edad;
	
	
	public Persona(String nombre, String apellido, Integer dni, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Boolean comprarEntrada() {
		return true;
	}


	public Boolean comprarCombo() {
		return true;
	}
}
