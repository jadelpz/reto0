package ejercicio1;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner sc= new Scanner (System.in);
		
		do
		{
			try
			{
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				break;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}
		while(true);

		}
	
	
	}


