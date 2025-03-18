package edu.ucam.boletin2.ejercicio2;

public class Principal {
	
	public static void main(String[] args) {
	
		Punto obj = new Punto(3, 4);
		
		System.out.println(obj.Imprimir());
		System.out.println("\nLa distancia euclidea es: "+obj.DistanciaEuclidea());
	}

}
