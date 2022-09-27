import java.util.Scanner;

public class EjercicioBasico7 {

	public static void main(String[] args) {
		
		int nombre, direccion, telefono;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca su nombre: ");
		
		nombre = dogma.nextInt();
		
		System.out.print("Nombre: " + nombre );
		
		System.out.print("Introduzca su direccion");
		
		direccion = dogma.nextInt();
		
		System.out.println( "Direccion: " + direccion);
		
		System.out.print("Introduzca su telefono");
		
		telefono = dogma.nextInt();
		
		System.out.print( "Telefono: " + telefono);
		
		//no acabado error con Scanner y lectura de variable int
	

	}

}
