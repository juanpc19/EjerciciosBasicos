import java.util.Scanner;

public class EjercicioBasico9 {

	public static void main(String[] args) {
		
		//Decladro variables y constantes y asigno valor a constante
		double euros, pesetas;
		final double cambioPesetasEuros=0.0060;
		//Creo, nombro e importo Scanner
		Scanner dogma = new Scanner(System.in);
		//Pido al usuario que introduzca la cantidad de pesetas
		System.out.print("Introduzca aqui la cantidad de pesetas: ");
		//Doy valor a variable pesetas mediante Scanner
		pesetas=dogma.nextInt();
		//Doy valor a variable euros mediante operacion aritmetica con variables pesetas y cambioPesetasEuros
		euros=pesetas*cambioPesetasEuros;
		//Muestro al usuario mensaje con valor de variable euros usando operador + antes y despues de variable en el mensaje
		System.out.print("Esa Cantidad de pesetas equivale a: " + euros + " euros");
		
		
		

	}

}
