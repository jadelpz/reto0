package ejercicio1;

import java.util.Scanner;

public class ej63 {
	

	public static void main(String[] args) {
	int n = 0;
	Scanner sc= new Scanner (System.in);
	
	do {
		System.out.println("introduce N�");
		String s = sc.nextLine();
		n = Integer.parseInt(s);
		
	}catch(Exception ex)
	
		System.out.println("Introduce un n� correcto");
	{
}
