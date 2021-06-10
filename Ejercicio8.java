/*
   8. Diseñar un algoritmo que genere números al azar múltiplos de 5, mientras el usuario no ingresa la opción ‘S’ (Salir)
*/

import java.util.*;

public class Ejercicio8 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		Random random = new Random();

		int numAl;
		String salir;

		do {

			System.out.print("\nIngrese una letra: ");
			salir = read.nextLine();

			if (!(salir.equals("S") || salir.equals("s"))) {

				do {
					numAl = random.nextInt(100)+1;
				} while (numAl%5!=0);
	
				System.out.println(" - "+numAl+" - ");

			}

		} while (!(salir.equals("S") || salir.equals("s")));

		System.out.println();

	}


}

