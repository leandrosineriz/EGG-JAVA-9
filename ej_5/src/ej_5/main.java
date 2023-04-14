/*
    Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de 
    nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase 
    PersonaService, en el paquete servicio, con los siguientes métodos:
    1. Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar 
    el objeto Persona creado.
    2. Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y 
    la fecha actual.
    3. Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor 
    que la edad consultada o false en caso contrario.
    4. Método mostrarPersona que muestra la información de la persona deseada.

 */
package ej_5;

import Class.Persona;
import Service.PersonaService;

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
        
        Persona p1 = PersonaService.crear_persona("Leo", 10, 7, 1995);
        Persona p2 = PersonaService.crear_persona("Maria", 2, 4, 2000);
        
        System.out.println(PersonaService.calcular_edad(p1));
        System.out.println(PersonaService.calcular_edad(p2));
        
        System.out.println(PersonaService.menor_que(p1, 50));
        System.out.println(PersonaService.menor_que(p2, 10));
        
        PersonaService.mostrar_persona(p1);
        PersonaService.mostrar_persona(p2);
    }

}
