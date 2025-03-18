package ejercicio10;

public class Poligono {
	
	///ATRIBUTOS
	private int lados;
	
	
	public Poligono() {
		this.lados = 0;
	}
	public Poligono(int lados) {
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