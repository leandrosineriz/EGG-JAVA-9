/*
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se 
   realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  
   En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, 
   en el paquete Servicios, que deberá además implementar los siguientes métodos:
 1. Método mostrarValores que muestra cuáles son los dos números guardados.
 2. Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
 3. Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente 
   se deben redondear ambos valores.
 4. Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada 
   se debe obtener el valor absoluto del número.

 */
package ej_2;

import Service.NumeroService;
import java.util.Scanner;

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
        NumeroService ns = new NumeroService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        
        while (true) {            
            System.out.println("1. Ver numeros");
            System.out.println("2. Devolver mayor");
            System.out.println("3. Calcular potencia");
            System.out.println("4. Calcular raiz");
            
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    ns.mostrar_valores();
                    break;
                case 2:
                    System.out.println(ns.devolver_mayor());
                    break;
                case 3:
                    System.out.println(ns.calcular_potencia());
                    break;
                case 4:
                    System.out.println(ns.calcular_raiz());
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        
    }
    
}
