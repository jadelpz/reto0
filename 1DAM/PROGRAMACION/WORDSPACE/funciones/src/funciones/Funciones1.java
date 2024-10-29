package funciones;

public class Funciones1 {
	public static void main(String[] args) {
		saludaNombreEdad("andres", "solano", 20);
		String s = notaAsignatura(8);
		System.out.println(s);


	}

	// nombre, apellido, edad
	public static void saludaNombreEdad(String nombre, String apellido, int edad) {
		System.out.println("Buenos dias, " + nombre + " " + apellido + ", tienes " + edad);
	}

	// Insufiente y suficiente
	public static String notaAsignatura(int nota) {
		if (nota < 5)
			return "insuficiente";
		else if (nota == 5)
			return "suficiente";

		else if (nota == 6)
			return "bien";
		else

		if (nota == 7 || nota == 8)
			return "Notable";
		else
			return "No es notable";
		
		if (nota > 8)
			return "sobresaliente";
		else
			return "No es sobresaliente";			
	}
}