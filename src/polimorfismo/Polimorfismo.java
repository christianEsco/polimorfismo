
package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        
        raton rat =new raton("gris","paquito","restos de comida que dejas en la cocina",2);
rat.alimentacion();
rat.mostrar();

        tigre tig = new tigre ("Grande","felipe","carne y niños",4);
tig.alimentacion();
tig.mostrar();
    }
    
}
