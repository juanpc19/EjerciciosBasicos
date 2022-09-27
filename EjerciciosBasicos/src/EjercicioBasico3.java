import java.util.Scanner;

public class EjercicioBasico3 {

	public static void main(String[] args) {
		
				//Declaramos las variables
				int añoActual, añoDeNacimiento,edad;
				//Creamos, nombramos e importamos nuestro Scanner
				Scanner dogma =  new Scanner(System.in);
				//Imprimimos mensaje por consola
				System.out.print("Introduzca año actual: ");
				//Asignamos valor a variable a traves de Scanner
				añoActual = dogma.nextInt();
				//Imprimimos mensaje por consola
				System.out.print("Introduzca fecha de nacimiento: ");
				//Asignamos valor a variable a traves de Scanner
				añoDeNacimiento = dogma.nextInt();
				//Asignamos valor a variable mediante resta de otras dos variables
				edad = añoActual - añoDeNacimiento;
				//imprimimos mensaje por consola añadiendo la variable deseada con operador + 
				System.out.print("Su edad actual es: " + edad);

	}

}
