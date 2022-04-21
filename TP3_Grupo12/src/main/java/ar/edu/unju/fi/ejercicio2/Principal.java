package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Principal {
//	Se solicita al usuario que ingrese por consola un número entero entre [1,9] (validar que ingrese un número
//	dentro de este rango), luego de mostrar la correspondiente tabla se muestra un mensaje al usuario
//	preguntando si desea ingresar otro número.
//	Utilice un arreglo para almacenar los números involucrados en la multiplicación (multiplicandos)
//	{0,1,2,3,4,5,6,7,8,9,10}
	
	public static void main(String[] args) {
		int n;
		String respuesta;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] multiplicandos = {0,1,2,3,4,5,6,7,8,9,10};
		do {
			System.out.println("Ingrese un numero del 1 al 9");
			n = scanner.nextInt();
			if(n > 0 && n < 10) {
				for(int i = 0; i < multiplicandos.length; i++) {
					System.out.println(n + " x " + multiplicandos[i] + " = " + n * multiplicandos[i]);
				}
			}
			System.out.println("Desea ingresar otro numero? si/no");
			respuesta = scanner.next();
		}while(respuesta.equals("si"));
		scanner.close();
	}
}
