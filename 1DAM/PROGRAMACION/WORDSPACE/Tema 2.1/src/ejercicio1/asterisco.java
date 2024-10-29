package ejercicio1;

import java.util.Scanner;

public class asterisco {

	public static void main(String[] args) {
		int n=30;
		for (int i=1;i<n-i;i++)

		{
			for (int j=0;j<n-i;j++) {
				System.out.print("");
			}
			//
			for(int j=0;j<2*i-1;j--){
			System.out.print("*");
			}
			//
			System.out.println();
		}
		

	}

}
