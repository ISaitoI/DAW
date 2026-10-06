package entradaSalida;

public class Casting {

	public static void main(String[] args) {
		int entero = 420;
		// Podemos iniciarlizar una variable con otra
		// Aqui elcambio es automatico
		long grande = entero;

		/*
		 * Esto no se pude hacer, si descomentamos la linea de abajo fala No puedo meter
		 * una caja grande en una caja peqyeña byte pequeña = entero;
		 */

		// Podemos hacer un cast, java me deja hacerlo, por mi cuenta y riesgo
		int enteroQueCabe = 125;
		int enteroQueNoCabe = 5000;
		byte pequeña = (byte) enteroQueCabe;
		byte pequeña2 = (byte) enteroQueNoCabe;

		System.out.println("Vamos a analizar la problematica: \n" + "Entero que cabe " + pequeña + "\n"
				+ "Entero que no cabe " + pequeña2);

		// Supongamos ahora que tenemos un numero en un string
		String edad = "42";
		// Edad lo toma como texto, y al ponerle + 1 ese 1 lo pasa a texto
		System.out.println("El año que viene tendre " + edad + 1 + "años");
		System.out.println("El año que viene tendre " + (Integer.parseInt(edad) + 1) + "años");

		int numero = 40;
		numero = numero + 10;
		System.out.println("Numero sumado: " + numero);
		System.out.println("Numero sumado: " + (numero + 10));
	}

}
