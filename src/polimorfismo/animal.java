
package polimorfismo;

public abstract class animal {
    private String nombre;
    private String tipo_alimentacion;
    private int edad;
    
     public animal(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
public abstract void alimentacion();

    
}
                                    






