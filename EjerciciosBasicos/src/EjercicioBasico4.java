import java.util.Scanner;

public class EjercicioBasico4 {

	public static void main(String[] args) {

				//Declaramos todas las variables
				int notai,notaf;
				double notaMedia;
				//Creamos, nombramos e importamos Scanner
				Scanner dogma = new Scanner(System.in);
				//Pedimos al usuario que introduzca la variable: nota de ingles
				System.out.print("Introduzca nota ingles: ");
				//Usamos el Scanner para asignar un valor a la variable
				notai=dogma.nextInt();
				//Pedimos al usuario que introduzca la variable: nota de frances
				System.out.print("introduzca nota frances: ");
				//Usamos el Scanner para asignar un valor a la variable
				notaf=dogma.nextInt();
				//Damos valor a la variable notaMedia a traves de media aritmetica usando variables notai y notaf
				notaMedia = (notai + notaf) /2;
				/*Mostramos al usuario el valor de la nota media imprimiendo en la consola el siguiente texto:
				Nota media: y añadimos la varible al mensaje con el operador + */
				System.out.print("Nota media: " + notaMedia);

	}

}
