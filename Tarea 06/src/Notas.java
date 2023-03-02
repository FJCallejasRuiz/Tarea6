

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
String calificacion = "";
System.out.print("Introduzca el valor de una calificación: ");
final int nota = reader.nextInt();

calificacion = califica(nota);


System.out.println(calificacion);
reader.close();
}

/**
 * @param num_nota
 * @return
 */
public static String califica(final int num_nota) {
	String calificacion;
	if (num_nota >= 0 && num_nota < 5) {
		calificacion = "Suspenso";
	}
	
	else if (num_nota >= 5 && num_nota < 7) {
		calificacion = "Aprobado";
	}
	
	else if (num_nota >= 7 && num_nota <9) {
		calificacion = "Notable";
	}
	
	else if (num_nota >= 9 && num_nota <= 10) {
		calificacion = "Sobresaliente";
	}
	
	else {
		calificacion = "El valor de la calificación introducida no es correcta";
	}
	return calificacion;
}
}