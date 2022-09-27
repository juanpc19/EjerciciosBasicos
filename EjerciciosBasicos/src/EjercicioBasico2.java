import java.util.Scanner;

public class EjercicioBasico2 {

	public static void main(String[] args) {
		
				//Declaramos variables
				int edad;
				//Creamos, nombramos e importamos nuestro Scanner
				Scanner dogma = new Scanner(System.in);
				//Imprimimos mensaje por consola
				System.out.print("Que edad tiene? ");
				//Asignamos a la variable su valor mediante el uso del Scanner en la siguiente variable int
				edad = dogma.nextInt();
				//Añadimos a la variable un +1 mediante el uso del operador ++
				edad++;
				//Imprimimos mensaje por consola y añadimos variable con operador +
				System.out.print("Su edad es: " + edad );

	}

}
