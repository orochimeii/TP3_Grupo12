package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal {
	
//	Desde la clase principal solicitar al usuario que ingrese por consola los datos de un alumno y por último
//	muestre el resultado de cada método.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = new double[5];
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido");
		String apellido = scanner.next();
		System.out.println("Ingrese libreta universitaria");
		int lu = scanner.nextInt();
		for(int i = 0; i < alumno.getNotas().length; i++) {
			System.out.println("Ingrese nota");
			notas[i] = scanner.nextDouble();
		}
		scanner.close();
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		alumno.setLu(lu);
		alumno.setNotas(notas);
		System.out.println("Maxima nota alcanzada: " + alumno.obtenerNotaMaxima());
		System.out.println("Promedio: " + alumno.calcularPromedio());
	}

}
