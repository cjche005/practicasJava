package operacionMatematicas;
import javax.swing.JOptionPane;

public class mates {
		//METODOS
		
		//Metodo para sumar ambos numeros con Parametros (int numero1, int numero2)
		public int sumar(int numero1, int numero2) {
			int suma = numero1 + numero2;
			return suma;
		}
		
		//Metodo para restar con Parametros (int numero1, int numero2)
		public int restar(int numero1, int numero2) {
			int resta = numero1 - numero2;
			return resta;
		}
		
		//Metodo para multiplicar con Parametros (int numero1, int numero2)
		public int multiplicar(int numero1, int numero2) {
			int multiplicacion = numero1 * numero2;
			return multiplicacion;
		}
		
		//Metodo para dividir con Parametros (int numero1, int numero2)
		public int dividir(int numero1, int numero2) {
			int division = numero1 / numero2;
			return division;
		}
		
		//Resultado
		public void mostrarResultados(int suma, int resta, int multiplicacion, int division) {
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+resta);
			System.out.println("La multiplicacion es: "+multiplicacion);
			System.out.println("La division es: "+division);
		}
}
