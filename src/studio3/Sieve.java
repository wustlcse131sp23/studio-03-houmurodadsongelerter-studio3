package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What number n do you want to sort up to?");
		int n = in.nextInt();

		int [] numbers;
		numbers = new int[n+1];

		for (int i = 0; i <= n; i++) {
			numbers[i] = i;
		}

		for (int factorA = 2; factorA*2<=n; factorA++) {

			for (int factorB = 2; factorB*factorA<=n; factorB++) {

				numbers[factorB*factorA] = -1;

			}

		}


		for (int index = 2; index <= n; index++) {

			if (numbers[index] != -1) {
				System.out.println(index);
				
			}
		}

	}

}
