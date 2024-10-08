package operacionMatematicas;

import javax.swing.JOptionPane;

public class principalMain {

	public static void main(String[] args) {
		//Mensaje e ingreso de valores por teclado
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		//Creacion del objeto "op" de la clase mates
		mates op = new mates();
		
		//objeto utilizando los metodos e ingresando argumentos n1,n2
		System.out.println("La suma es: " + op.sumar(n1, n2));
		System.out.println("La resta es: " + op.restar(n1, n2));
		System.out.println("La multiplicacion es: " + op.multiplicar(n1, n2));
		System.out.println("La division es: " + op.dividir(n1, n2));
		
	}
}
