
import java.util.Scanner;

/**
 * @author fran_
 * @since 02/03/2023
 * @version 1.0
 *
 */
public class Notas {
	/**
	 * 
	 * @param reader en el que pediremos el numero de la nota
	 * @param calificacion en el que luego será el resultado de la nota
	 * @return calificacion
	 * 
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		String calificacion = "";
		System.out.print("Introduzca el valor de una calificación: ");
		final int nota = reader.nextInt();

		calificacion = califica.califica(nota);

		System.out.println(calificacion);
		reader.close();
	}
}