/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete 
Servicios, que tenga los siguientes métodos:

1. Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase 
por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date 
fecha = new Date(anio, mes, dia);
2. Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor 
vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
3. Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre 
una y otra (edad del usuario).

Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
package ej_4;

import Service.FechaService;
import java.util.Date;

/**
 *
 * @author itsmi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date d1 = FechaService.fecha_nacimiento();
        Date d2 = FechaService.fecha_actual();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(FechaService.diferencia_anios(d1, d2));
    }
    
}
