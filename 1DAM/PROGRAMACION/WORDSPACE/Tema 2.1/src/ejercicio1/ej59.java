package ejercicio1;

import java.util.Random;

public class Ej59 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int n1=r.nextInt(1,11);
		int n2=r.nextInt(1,11);
		
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		
		if(n1>n2) {
			System.out.println(n1 + " es mayor que " +n2);
		}
		else if(n2>n1) {
			System.out.println(n2 + " es mayor que " +n1);
		}
		else {
			System.out.println(n1 + " es igual a " +n2);
		}

		

	}

}