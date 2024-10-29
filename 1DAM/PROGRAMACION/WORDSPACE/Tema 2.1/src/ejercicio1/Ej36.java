package ejercicio1;

import java.util.Scanner;

public class Ej36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("INTRODUCE EL NUMERO");
		//pedir un numero y guardarlo en n1//
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		//MOSTRAR EL CONTENIDO DE AMBAS VARIABLES//
		System.out.println("Mostrar ambos contenidos");
		String c = sc.nextLine();
		int c2 = Integer.parseInt(c);
		
		
		
		
		System.out.println("Introduce otro numero");
		String s2=sc.nextLine();
		int n2=Integer.parseInt(s2);
		
		System.out.println(n+2);
		sc.close();
		


	}

}
