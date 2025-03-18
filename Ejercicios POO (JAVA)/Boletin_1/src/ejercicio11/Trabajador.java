package ejercicio11;

public class Trabajador extends Persona {
	
	protected float salario;
	protected String ccc;
	
	public Trabajador(String nombre, String apellido, String direccion, float salario, String ccc) {
		super(nombre, apellido, direccion);
		this.salario = salario;
		this.ccc = ccc;
	}

}
