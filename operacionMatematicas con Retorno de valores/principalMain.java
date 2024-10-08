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
		int suma = op.sumar(n1, n2);
		int resta = op.restar(n1, n2);
		int mult = op.multiplicar(n1, n2);
		int div = op.dividir(n1, n2);
		
		op.mostrarResultados(suma, resta, mult, div);
	}
}
