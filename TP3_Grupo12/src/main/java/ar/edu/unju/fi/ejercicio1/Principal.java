package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal {
	
//	 declare dos
//	 arreglos que almacenen elementos de tipo enteros. Utilizando un objeto scanner solicite al usuario que
//	 ingrese por consola 5 números que serán guardados en el primer arreglo, luego solicite otros 5 números que
//	 serán guardados en el segundo arreglo.
//	 Construya un método que muestre por consola la división entre los números del primer arreglo y el segundo
//	 arreglo, los índices deben corresponderse al momento de hacer la división.
//	 Agregue el manejo de excepciones si fuera necesario.

	public static int[] numeros = new int[5];
	public static int[] numeros2 = new int[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un numero");
			int n = scanner.nextInt();
			numeros[i] = n;
			if (i == numeros.length - 1) {
				System.out.println("***Primer array completo");
			}
		}
		
		for(int j = 0; j < numeros2.length; j++) {
			System.out.println("Ingrese un numero");
			int n = scanner.nextInt();
			numeros2[j] = n;
			if (j == numeros2.length - 1) {
				System.out.println("***Segundo array completo");
			}
		}
		scanner.close();
		try {
			dividirArrays(numeros, numeros2);
		}catch(ArithmeticException ae) {
			System.out.println("no me es posible calcular el resultado de una division por 0");
		}
	}
	public static void dividirArrays(int[] arr1, int[] arr2) {
		for(int k = 0; k < numeros.length; k++) {
			System.out.println(numeros[k] / numeros2[k]);
		}
	}

}
