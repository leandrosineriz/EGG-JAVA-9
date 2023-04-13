/*
1. Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase 
por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date 
fecha = new Date(anio, mes, dia);
2. Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor 
vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
3. Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre 
una y otra (edad del usuario).

 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class FechaService {
    
    
    
    public static Date fecha_nacimiento() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su dia de nacimento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese su anio de nacimento:");
        int anio = leer.nextInt();
        return new Date(anio-1900,mes-1,dia);
    }
    
    public static Date fecha_actual() {
        return new Date();
    }
    
    public static int diferencia_anios(Date d1, Date d2) {
        if (d2.getMonth() < d1.getMonth()) {
            System.out.println(d2.getMonth() +" "+ d1.getMonth()+" " + d2.getDate()+" " + d1.getDate());
            return d2.getYear() - d1.getYear() - 1;
        } else if (d2.getMonth() == d1.getMonth() && d2.getDate() < d1.getDate()) {
            System.out.println(d2.getMonth() +" "+ d1.getMonth()+" " + d2.getDate()+" " + d1.getDate());
            return d2.getYear() - d1.getYear() - 1;
        } else {
            System.out.println(d2.getMonth() +" "+ d1.getMonth()+" " + d2.getDate()+" " + d1.getDate());
            return d2.getYear() - d1.getYear();
        }
        
    }
}
