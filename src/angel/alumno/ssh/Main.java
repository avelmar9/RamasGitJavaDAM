package angel.alumno.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random random = new Random();
		int[] numeros = new int[5]; // 5 números principales
		int complementario;

		System.out.println("Números de la Lotería Primitiva:");

		// Generar los 6 números principales SIN REPETIDOS
		for (int i = 0; i < 5; i++) {
			int num;
			boolean repetido;

			do {
				num = random.nextInt(49) + 1; // números entre 1 y 49
				repetido = false;

				// Comprobar si ya existe
				for (int j = 0; j < i; j++) {
					if (numeros[j] == num) {
						repetido = true;

					}
				}

			} while (repetido);

			numeros[i] = num;
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		// Generar complementario
		do {
			complementario = random.nextInt(49) + 1;

			boolean rep = false;
			for (int n : numeros) {
				if (n == complementario) {
					rep = true;
					break;
				}
			}
			if (!rep)
				break; // no repetido → aceptado

		} while (true);

		System.out.println("Complementario: " + complementario);

	}
}
