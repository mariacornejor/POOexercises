package ejercicio11;

public class Cliente extends Persona {
	protected String CIF;
	
	public Cliente(String nombre, String apellido, String direccion, String CIF) {
		super(nombre, apellido, direccion);
		this.CIF = CIF;
	
	}

}
