package ar.edu.unju.fi.ejercicio3;

import java.util.Arrays;

public class Alumno {
//	3.- Crear una clase denominada Alumno con los siguientes atributos: Nombre, apellido, Libreta Universitaria,
//	notas (arreglo que almacena 5 notas de tipo double). Construir dentro de la clase Alumno los siguientes
//	métodos:
//	calcularPromedio() retorna el promedio de las notas del alumno.
//	obtenerNotaMaxima() que retorna la nota máxima.
	private String nombre;
	private String apellido;
	private int lu;
	private double[] notas = new double[5];
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLu() {
		return lu;
	}
	public void setLu(int lu) {
		this.lu = lu;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String nombre, String apellido, int lu, double[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.lu = lu;
		this.notas = notas;
	}
	
	public double calcularPromedio() {
		double suma = Arrays.stream(this.notas).reduce(0,(a, b)->  a + b);
		return suma / this.notas.length;
	}
	
	public double obtenerNotaMaxima() {
		double max = this.notas[0];
		for(double nota: this.notas) {
			if(nota > max)max = nota;
		}
		return max;
		
	}
}
