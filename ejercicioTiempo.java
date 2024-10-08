package codPrueba;

import java.util.Scanner;

public class claseMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);//creacion de Scanner para ingresar valores
		int horasTotales, semanas, dias, horas;
		
		System.out.print("Digite el numero de horas: ");
		horasTotales = entrada.nextInt(); //entrada por teclado
		
		//operaciones matematicas para sacar las semanas, dias y horas.
		semanas = horasTotales / 168; 
		dias = horasTotales%168 / 24;
		horas = horasTotales%24;
		
		//resultado de las operaciones con el valor ingresado
		System.out.println("El equivalente es: ");
		System.out.println(semanas + " semanas");
		System.out.println(dias + " dias");
		System.out.println(horas + " hs");
		
		
	}
}
