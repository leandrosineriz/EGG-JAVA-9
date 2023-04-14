/*
    Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
    1. Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar 
    el objeto Persona creado.
    2. Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y 
    la fecha actual.
    3. Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor 
    que la edad consultada o false en caso contrario.
    4. Método mostrarPersona que muestra la información de la persona deseada.
 */
package Service;

import Class.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author itsmi
 */
public class PersonaService {
    
    public static Persona crear_persona(String nombre, int dia, int mes, int anio) {
        Calendar c = new GregorianCalendar();
        c.set(anio, mes, dia);
        return new Persona(nombre, c.getTime());
    }
    
    public static int calcular_edad(Persona p) {
        Calendar d1 = new GregorianCalendar();
        Calendar d2 = new GregorianCalendar();
        d1.setTime(p.getFecha());
        d2.setTime(new Date());
        
        if (d2.get(Calendar.MONTH) < d1.get(Calendar.MONTH)) {
            //System.out.println(d2.getMonth() +" "+ d1.getMonth()+" " + d2.getDate()+" " + d1.getDate());
            return d2.get(Calendar.YEAR) - d1.get(Calendar.YEAR) - 1;
        } else if (d2.get(Calendar.MONTH) == d1.get(Calendar.MONTH) && d2.get(Calendar.DATE) < d1.get(Calendar.DATE)) {
            //System.out.println(d2.getMonth() +" "+ d1.getMonth()+" " + d2.getDate()+" " + d1.getDate());
            return d2.get(Calendar.YEAR) - d1.get(Calendar.YEAR) - 1;
        } else {
            //System.out.println(d2.getMonth() +" "+ d1.getMonth()+" " + d2.getDate()+" " + d1.getDate());
            return d2.get(Calendar.YEAR) - d1.get(Calendar.YEAR);
        }
    }
    
    public static boolean menor_que(Persona p, int edad) {
        return PersonaService.calcular_edad(p) < edad;
    }
    
    public static void mostrar_persona(Persona p) {
        System.out.println(p);
    }
}
