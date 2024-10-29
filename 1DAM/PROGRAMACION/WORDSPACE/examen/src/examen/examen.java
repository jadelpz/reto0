package examen;

import java.util.Scanner;
public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in);
		int n= 0, suma=0,cont=0,primero=0;
		do {
			try {
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				if(n>0)
				{
					//el primero
					if(cont==0)
						primero=n;
					suma+=n;
					cont++;
				}
				
			}
				
			catch (Exception ex) {
				System.out.println("Introduce un numero correcto");
			}

		} while (true);	

	}
sc.close();
}
