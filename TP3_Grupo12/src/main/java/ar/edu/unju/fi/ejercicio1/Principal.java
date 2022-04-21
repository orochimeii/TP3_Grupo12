package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numeros;
		int[] numeros2 = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingrese un numero");
			int n = scanner.nextInt();
			numeros2[i] = n;
		}
		scanner.close();
	}

}
