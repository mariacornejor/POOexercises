package ejercicio11;

public class ClienteVIP extends Cliente {
	private float descuento;
	
	public ClienteVIP(String nombre, String apellido, String direccion, String CIF, float descuento) {
		super(nombre, apellido, direccion, CIF);
		this.descuento = descuento;
	}

}
