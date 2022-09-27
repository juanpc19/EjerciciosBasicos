import java.util.Scanner;

public class EjercicioBasico5 {

	public static void main(String[] args) {
		
			//Declaro las variables
			double radio,longitud,area,pi,piCuadrado;
			//Creo, nombro e importo el Scanner
			Scanner dogma = new Scanner(System.in);
			//Asigno valor a variable pi con el uso de Math.PI  
			pi = Math.PI;
			//Asigno valor a la variable piCuadrado con el uso de Math.pow (y uso (pi,2) para indicar la base y el exponente)
			piCuadrado = Math.pow(pi,2);
			//Pido a usuario el radio de la circunferencia
			System.out.print("Proporcione el radio de la circunferencia: ");
			//Asigno a variable radio un valor mediante uso del Scanner
			radio = dogma.nextDouble();
			//Asigno a variable longitud un valor mediante operacion matematica con variables: radio y pi
			longitud = radio*2*pi;
			//Imprimo en consola La longitud es: y añado su valor usando operador + y el nombre de la variable
			System.out.println("La longitud es: " + longitud);
			//Asigno a varible area un valor mediante operacion aritmetica con variables: radio y piCuadrado
			area = radio*piCuadrado;
			//Imprimo en consola El area es: añado su valor usando operador + y el nombre de la varible
			System.out.print("El area es: " + area);
			
			
	}
}
