

import java.util.Scanner;

public class Notas {

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