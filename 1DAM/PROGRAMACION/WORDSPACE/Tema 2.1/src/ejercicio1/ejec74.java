package ejercicio1;

import java.util.Scanner;

public class ejec74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do
		{
			try
			{
				System.out.println("INTRODUCE OTRO NUMERO");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				
				
				System.out.println("la suma de " + n + "  es");
			}
			catch(Exception ex)
			{
				System.out.println("Numero no valido introduce numero con valor  ");
			}

		}while(n!=0);


	

	}
}
