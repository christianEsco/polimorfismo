
package polimorfismo;

public class raton extends animal {
    private String color;

    public raton(String color,String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
    this.color= color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void mostrar () {
   System.out.println( " Nombre de animal: " + getNombre());
   System.out.println( " Tipo de alimentacion " + getTipo_alimentacion());
   System.out.println( " el color es" + getColor());
   System.out.println( " La edad es: " + getEdad());
    }
    


    @Override
    public void alimentacion() {
        System.out.println("Mealimento de restos de comida"); 


    }  
}


