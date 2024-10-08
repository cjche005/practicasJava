package practica;

public class persona {
	//ATRIBUTOS
	String nombre;
	int edad;
	
	//METODOS
	
	//Metodo Constructor
	public persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/*
	 * Forma alternativa de constructor
	 * public persona(String _nombre, int _edad) {
		nombre = _nombre;
		edad = _edad;
	}
	 */
	
	
	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: "+edad);
	}
}
