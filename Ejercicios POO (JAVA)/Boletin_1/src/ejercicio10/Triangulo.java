package ejercicio10;

import java.util.ArrayList;

public class Triangulo extends ejercicio10.Poligono {

	//CONSTRUCTOR
	public Triangulo() {
		super(3); //llama constructor del padre
		System.out.println("Triangulo creado");
	}
	
	public static void main(String[] args) { //esto siempre igual
		Triangulo t = new Triangulo ();
		System.out.println("Lado: " +t.getLados());
		
		Rectangulo r = new Rectangulo ();
		System.out.println("Lado: " +r.getLados());
	
		System.out.println();
		
	ArrayList<Poligono> l = new ArrayList<Poligono>();
	l.add(r);
	l.add(t);
	
	for (Poligono p : l) //for each
	{
		System.out.println("Numero de lados: "+p.getLados());
	}
	}
}
