package edu.ucam.boletin2.ejercicio2;

public class Punto {
	public int x;
	public int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String Imprimir() {
		return ("Posicion X: "+x+"\nPosicion y: "+y);
	}
	
	public double DistanciaEuclidea() {
		double distancia = 0;
		distancia = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
		return distancia;
	}

}
