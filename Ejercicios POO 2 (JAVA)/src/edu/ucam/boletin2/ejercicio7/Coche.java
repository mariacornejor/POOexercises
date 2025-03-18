package edu.ucam.boletin2.ejercicio7;
import java.io.Serializable;

public class Coche implements Serializable{
	private String Matricula;
	private String Marca;
	private int Anio;
	private double CapMotor;
	
	public Coche(String Matricula, String Marca, int Anio, double CapMotor) {
		super();
		this.Matricula = Matricula;
		this.Marca = Marca;
		this.Anio = Anio;
		this.CapMotor = CapMotor;
	}
	
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String Matricula) {
		this.Matricula = Matricula;
	}
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public int getAnio() {
		return Anio;
	}
	public void setAnio(int Anio) {
		this.Anio = Anio;
	}
	
	public double CapMotor() {
		return CapMotor;
	}
	public void setCapMotor(int CapMotor) {
		this.CapMotor = CapMotor;
	}

}
