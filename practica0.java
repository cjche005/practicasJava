
public class Main
{
   public static void main(String[] args) {
        //creacion de objeto
        Coche coche1 = new Coche();
        
        //llenar atributos del objeto
        coche1.color = "Blanco";
        coche1.marca = "Ford";
        coche1.km = 0;
        
        //mostrar los atributos
        System.out.println("El color del coche1 es: "+ coche1.color);
        System.out.println("La marca del coche1 es: "+ coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+ coche1.km);
    }
}