import java.util.Scanner;

public class EjercicioBasico8 {

	public static void main(String[] args) {

		//Declaro variables
		int nombre, edad;
		//Creo, nombro e importo Scanner
		Scanner dogma = new Scanner(System.in);
		//Pido al usuario que introduzca su nombre y edad
		System.out.print("Introduzca su nombre: ");
		//
		String line = dogma.nextLine();
		nombre=dogma.nextInt();
		edad=dogma.nextInt();
		System.out.print("Hola" + nombre + "tienes" + edad + "que joven eres!");
		
		//no acabado problemas con Scanner y lectura de variables

	}

}
