package operacionMatematicas;
import javax.swing.JOptionPane;

public class mates {
	//ATRIBUTOS
		int numero1;
		int numero2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		//METODOS
		
		//Metodo para pedirle al usuario que nos digite 2 numeros
		/*
		 * JOptionPane es una clase que nos permite mostrar un dialogo
		 * gráfico con el que podemos interactuar para introducir o mostrar
		 * la información que queramos. Esta clase se encuentra en el paquete javax.
		 */
		public void leerNumeros () {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		}
		
		//Metodo para sumar ambos numeros
		public void sumar() {
			suma = numero1+numero2;
		}
		
		//Metodo para restar
		public void restar() {
			resta=numero1-numero2;
		}
		
		//Metodo para dividir
		public void dividir() {
			division= numero1/numero2;
		}
		
		//Metodo para multiplicar
		public void multiplicar() {
			multiplicacion=numero1*numero2;
		}
		
		//Resultado
		public void mostrarResultador() {
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+resta);
			System.out.println("La multiplicacion es: "+multiplicacion);
			System.out.println("La division es: "+division);
		}
}
