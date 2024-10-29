package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class ej70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=0;
		Random r = new Random();
		int a=r.nextInt(1,21);
		System.out.println(a);
		do
		{
			try
			{
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				// Proceso IF El numero es mayor o menor
				System.out.println(a>n?"mayor":"menor");

				
			
			}
			catch(Exception ex)
			{
				System.out.println("El Nº introducido no es correcto");
			}
		}while(n!=a);

		
		

	}

}
