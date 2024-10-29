package ejercicio1;

import java.util.Scanner;

public class EJ62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		do {
			System.out.println("INTRODUCE EL PRIMER NUMERO");
			n = sc.nextInt();
			//impar
		} while (!((n % 2 == 1 && n>100) || n % 7==0) );
		//cierra
		sc.close ();
		

	}

}