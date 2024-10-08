package operacionMatematicas;

public class principalMain {

	public static void main(String[] args) {
		//creacion de objeto
		/*
		 * mates = nombre de clase
		 * op = nombre del objeto
		 * mates() = constructor
		 */
		mates op = new mates();
		
		//metodos utilizando el objeto
		op.leerNumeros();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.mostrarResultador();
	}

}
