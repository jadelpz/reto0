package ejercicio1;

import java.util.Scanner;

public class EJ73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		do {
			try {
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				System.out.println("divisores de numero de  " + n + "  son ");
				for (int i = 1; i <= n; i++) {
					if (n%i == 0)
						System.out.println(i);
				}
				break;
			}

			catch (Exception ex) {
				System.out.println("mal");
			}

		} while (true);

	}
}