import java.util.Scanner;

public class EjercicioBasico10 {

	public static void main(String[] args) {

			//Declaro variables y constantes
			final int IVA = 21;
			double precio;
			double precioConIVA;
			//Creo nombro e importo el Scanner
			Scanner dogma = new Scanner(System.in);
			//Pido al usuario que introduzca un precio			
			System.out.print("Introduzca un precio: ");
			//asigno valor a variable precio con Scanner
			precio = dogma.nextDouble();
			//Asigno valor a variable precioConIva haciendo operacion aritmetica usando variables y constantes
			precioConIVA = precio * IVA /100 + precio;
			//Muestro el precio con IVA en consola añadiendolo con operador + al resto del mensaje
			System.out.println("El precio con IVA es: " + precioConIVA);
	
	}
}
