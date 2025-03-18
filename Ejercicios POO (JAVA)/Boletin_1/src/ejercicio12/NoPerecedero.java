package ejercicio12;

public class NoPerecedero extends Producto {
	protected String fechaFabricacion;
	
	public NoPerecedero(float precio, String fechaFabricacion) {
		super(precio);

		this.fechaFabricacion = fechaFabricacion;
	}
	
	@Override
	public String getFecha()
	{
		return this.fechaFabricacion;
	}
}
