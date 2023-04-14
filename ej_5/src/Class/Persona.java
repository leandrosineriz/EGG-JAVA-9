/*
    Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de 
    nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.
 */
package Class;

import java.util.Date;

/**
 *
 * @author itsmi
 */
public class Persona {
    private String nombre;
    private Date fecha;

    public Persona() {
    }

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
    
    
}
