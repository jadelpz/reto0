package ejercicio1;

import java.util.Scanner;

public class ej75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int precio_normal = 50;
		int precio_lanzamiento = 60;
		double Desc_10 = 0.10;
		double Desc_20 = 0.20;
		double suma =0;

		System.out.println("¿Cuantos videojuegos deseas  ?");
		int cantidad_juegos = sc.nextInt();

		double Total_pagar = 0;
		for (int i = 0; i < cantidad_juegos; i++)		{
			System.out.println("elija el tipo de juego" + i + "   1- Normal 2- Lanzamiento ");
			int tipo = sc.nextInt();
			
			if (tipo==1 ) {
				suma= suma +precio_normal;
			}

			else if (tipo==2) {
				suma=suma + precio_lanzamiento;
				
			}
					else {
						System.out.println("Tipo de juego no valido");
						i--;
				}
			
			}
		// calcular compra y descuento
		double descuento =0;
		//compra mas de 5 juegos
		if (cantidad_juegos>5)
			suma = suma +precio_normal;
		
		if(cantidad_juegos>=3)
			suma =  suma-(suma * Desc_10);
		

		System.out.println(suma);

		
		
		
		}
	}
