import java.util.Scanner;

public class EjercicioBasico6 {

	public static void main(String[] args) {
		
				//Declaro las variables
				double variable1, variable2, sumaVariables, restaVariables,multiplicacionVariables,divisionVariables;
				//Creo, nombro e importo el Scanner
				Scanner dogma = new Scanner(System.in);
				//Pido al usuario que introduzca el valor de variable1
				System.out.print("Introduzca valor de variable 1: ");
				//Asigno dicho valor a la variable mediante el uso del Scanner
				variable1 = dogma.nextDouble();
				//Pido al usuario que introduzca el valor de variable2
				System.out.print("Introduzca valor de variable 2: ");
				//Asigno dicho valor a la variable mediante el uso del Scanner
				variable2 = dogma.nextDouble();
				//Asigno valor a variable sumaVariables mediante operacion aritmetica de variable1 y variable2
				sumaVariables = variable1 + variable2;
				//Muestro al usuario el resultado de la operacion aritmetica imprimiendo en consola
				System.out.println("La suma de las variables es: " + sumaVariables);
				//Asigno valor a variable restaVariables mediante operacion aritmetica de variable1 y variable2
				restaVariables = variable1 - variable2;
				//Muestro al usuario el resultado de la operacion aritmetica imprimiendo en consola
				System.out.println("La resta de las variables es: " + restaVariables);
				//Asigno valor a variable multiplicacionVariables mediante operacion aritmetica de variable1 y variable2
				multiplicacionVariables = variable1 * variable2;
				//Muestro al usuario el resultado de la operacion aritmetica imprimiendo en consola
				System.out.println("La multiplicacion de las variables es: " + multiplicacionVariables);
				//Asigno valor a variable divisionVariables mediante operacion aritmetica de variable1 y variable2
				divisionVariables = variable1 / variable2;
				//Muestro al usuario el resultado de la operacion aritmetica imprimiendo en consola
				System.out.println("La division de las variables es: " + divisionVariables);
	}

}
