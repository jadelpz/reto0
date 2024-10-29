package ejercicio1;

import java.util.Scanner;

public class ej78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Escribe un numero: ");
		int numero_primo = sc.nextInt();
		// pedir al usuario que coloque el numero primario
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
				mayor=Math.max(n, mayor);
				menor =Math.min(n, menor);
				for (int i = 0; i < numero_primo; i++)		{
					System.out.println("El numero es primo " + numero_primo);
					int primo = sc.nextInt();
				}
				if(n>mayor && n<menor)
				{
					System.out.println("El numero "+ n + " es primo " + n);
				}
				else if(n>mayor && n<menor)
				{
					System.out.println("El numero "+ n + " no es primo " + n);
				}
				else
				{
					System.out.println("No es un numero no valido " );
				}
				sc.close();
				
				}	
	}


