package ejercicio1;

import java.util.Scanner;

public class ej76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tablas del 1 al 9");
		String s=sc.nextLine();
		int n=Integer.parseInt(s);

		System.out.println("tabla de "+ n);
		for(int i=1;i<11;i++) {
		}
		System.out.println(n +"x" + i + "=" + n*i);
	
	}
}
