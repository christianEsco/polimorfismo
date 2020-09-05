
package polimorfismo;


public class tigre extends animal {
    
       private String tamaño;

    public tigre(String tamaño,String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
    this.tamaño= tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }


    public void mostrar () {
   System.out.println( " Nombre de animal: " + getNombre());
   System.out.println( " Tipo de alimentacion " + getTipo_alimentacion());
   System.out.println( " el Tamaño es" + getTamaño());
   System.out.println( " La edad es: " + getEdad());
    }
    

    @Override
    public void alimentacion() {
        System.out.println("Me alimento de carne y niños");
    }
    
}
