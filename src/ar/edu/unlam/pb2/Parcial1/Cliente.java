package ar.edu.unlam.pb2.Parcial1;

public class Cliente extends Persona {
	
	private TipoCliente tipoDeCliente;
	private Boolean mensualidadActiva;
	
	public Cliente(String nombre, String apellido, Integer dni, Integer edad,TipoCliente tipoDeCliente, Boolean mensualidadActiva) {
		super(nombre, apellido, dni, edad);
		this.tipoDeCliente = tipoDeCliente;
		this.mensualidadActiva = mensualidadActiva;
	}

	public TipoCliente getTipoDeCliente() {
		return tipoDeCliente;
	}

	public void setTipoDeCliente(TipoCliente tipoDeCliente) {
		this.tipoDeCliente = tipoDeCliente;
	}

	public Boolean getMensualidadActiva() {
		return mensualidadActiva;
	}

	public void setMensualidadActiva(Boolean mensualidadActiva) {
		this.mensualidadActiva = mensualidadActiva;
	}
}
