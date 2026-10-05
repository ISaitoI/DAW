package entradaSalida;
import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Hola, como te llamas? \n");
		String nombre = sc.nextLine();
		
		if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
			System.out.print("Encantado de conocerte "+nombre);
		} else {
			System.out.print("¡ERROR! \n"
							+ "Favor introducir un nombre válido! \n");
			nombre = sc.nextLine();
			System.out.print("Encantado de conocerte "+nombre);
		}

	}

}
