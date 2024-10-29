package ejercicio1;

import java.util.Scanner;

public class ej60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("INTRODUCE EL PRIMER NUMERO");
		int n= sc.nextInt();
		System.out.println("INTRODUCE EL SEGUNDO NUMERO");
		int n2= sc.nextInt();
		// mayor y menor
		int mayor = Math.max(n,n2);
		int menor = Math.min(n,n2);
		System.out.println(mayor+" "+menor);
		while (mayor>=menor)
		{
			System.out.println(mayor);
			mayor--;
			
			
		}
		
		
		
		
		
	}

}
