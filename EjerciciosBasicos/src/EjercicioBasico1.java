import java.util.Scanner;

public class EjercicioBasico1 {

	public static void main(String[] args) {
		
				//Declaramos las variables
				int numero;
				/*Creamos nuestro Scanner para recibir informacion del usuario y le damos nombre para usarlo
				importamos el Scanner mediante: import java.util.Scanner*/
				Scanner dogma = new Scanner(System.in);
				//Usamos System.out.print para imprimir nuestro mensaje por consola
				System.out.print("Introduzca un numero: ");
				/*Le damos a la varible un valor a traves del Scanner (nombre Scanner) e indicandole a este
				que lea la siguiente variable de tipo int usando el comando next.Int */
				numero = dogma.nextInt();
				//Una vez tenemos el valor de la variable lo añadimos al mensaje con el operador +
				System.out.print("El numero introducido es: " + numero);
	
				

	}

}
