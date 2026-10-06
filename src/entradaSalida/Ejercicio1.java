package entradaSalida;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// System.out.print("Hola mundo desde Eclipse!!");

		System.out.print("Introduce tu nombre: ");
		String nombre1 = scanner.nextLine();

		System.out.print("Introduce tu edad (número entero): ");
		int edad1 = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Introduce tu nombre: ");
		String nombre2 = scanner.nextLine();

		System.out.print("Introduce tu edad (número entero): ");
		int edad2 = scanner.nextInt();

		System.out.print("Los datos del primero son: \n" + 
						 "Nombre: " + nombre1 + "     " + "Edad: " + edad1 + "\n");
		System.out.print("Los datos del segundo son: \n" + 
						 "Nombre: " + nombre2 + "     " + "Edad: " + edad2 + "\n");
		
		scanner.close();
	}
}
