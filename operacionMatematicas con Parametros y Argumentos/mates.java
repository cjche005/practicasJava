package operacionMatematicas;
import javax.swing.JOptionPane;

public class mates {
	//ATRIBUTOS
	
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		//METODOS
		
		//Metodo para sumar ambos numeros con Parametros (int numero1, int numero2)
		public void sumar(int numero1, int numero2) {
			suma = numero1 + numero2;
		}
		
		//Metodo para restar con Parametros (int numero1, int numero2)
		public void restar(int numero1, int numero2) {
			resta = numero1 - numero2;
		}
		
		//Metodo para dividir con Parametros (int numero1, int numero2)
		public void dividir(int numero1, int numero2) {
			multiplicacion = numero1 * numero2;
		}
		
		//Metodo para multiplicar con Parametros (int numero1, int numero2)
		public void multiplicar(int numero1, int numero2) {
			division = numero1 / numero2;
		}
		
		//Resultado
		public void mostrarResultados() {
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+resta);
			System.out.println("La multiplicacion es: "+multiplicacion);
			System.out.println("La division es: "+division);
		}
}
