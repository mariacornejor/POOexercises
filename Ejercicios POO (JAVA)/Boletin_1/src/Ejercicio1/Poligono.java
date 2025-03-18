package Ejercicio1;

public class Poligono {
	
	///ATRIBUTOS
	private int lados;
	
	
	public Poligono() {
		System.out.println("Poligono creado");
		this.lados = 0;
	}
	public Poligono(int lados) {
		System.out.println("Poligono creado");
		this.lados = lados;
	}
	
	///METODOS
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;	
	}
	public static void main(String[] args) {
		Poligono Triangulo=new Poligono(3);
		System.out.println("Numero de lados: "+ Triangulo.getLados());
	}
	
}