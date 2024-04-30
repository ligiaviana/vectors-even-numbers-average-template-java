package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		double par = 0.0;
		int pos = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				par += vect[i];
				pos++;
			}
		}

		double mediapares = 0.0;

		if (par == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediapares = (double) par / pos;

			System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		}

		sc.close();
	}
}
