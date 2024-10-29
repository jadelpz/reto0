package ejercicio1;


import java.util.Random;


public class EJ40 {

	public static void main(String[] args) {
		Random r = new Random(20);
		System.out.println(r.nextInt(0,13));
		System.out.println(r.nextInt(0,13));
		System.out.println(r.nextInt(0,13));
		
		Random r2 = new Random(15);
		System.out.println(r.nextInt(0,13));
		System.out.println(r.nextInt(0,13));
		System.out.println(r.nextInt(0,13));
		
		Random r3 = new Random(30);
		System.out.println(r.nextInt(50,86));
		System.out.println(r.nextInt(50,86));
		System.out.println(r.nextInt(50,86));
		
		Random r4 = new Random(15);
		System.out.println(r.nextInt(-10,1));
		System.out.println(r.nextInt(-10,1));
		System.out.println(r.nextInt(-10,1));

		Random r5 = new Random(40);
		System.out.println(r.nextDouble(0,2));
		System.out.println(r.nextDouble(0,2));
		System.out.println(r.nextDouble(0,2));
		
		
		Random r6 = new Random(100);
		System.out.println(r.nextDouble(10,31));
		System.out.println(r.nextDouble(10,31));
		System.out.println(r.nextDouble(10,31));
		

	}

}
