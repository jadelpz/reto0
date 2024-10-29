package ejercicio1;

import java.util.Scanner;

public class Eje37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("INTRODUCE EL NUMERO");
		//pedir un numero y guardarlo en n1//
		String s = sc.nextLine();
		int n1 = Integer.parseInt(s);
		
		System.out.println("Introduce otro numero");
		String s2=sc.nextLine();
		int n2=Integer.parseInt(s2);
		
		//MOSTRAR EL CONTENIDO DE AMBAS VARIABLES//
		System.out.println("valor de n "+n1);
		System.out.println("valor de n2 "+n2);
		
		//valor viceversa//
		int n3 = n1;
		n1 = n2;
		n2 =n3;
		System.out.println("cambiar n1 = n1" +n1);
		System.out.println("cambiar n3 = n1" +n3);
		
		


	}

}