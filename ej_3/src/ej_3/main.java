/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
1. Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2. Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3. Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4. Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las 
últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package ej_3;

import Service.ArregloService;
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
        float[] arrA = new float[50];
        float[] arrB = new float[20];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        while (true) {     
            System.out.println("*******************");
            System.out.println("1. Inicializar A");
            System.out.println("2. Inicializar B");
            System.out.println("3. Mostrar A");
            System.out.println("4. Ordenar A");
            System.out.println("5. Mostrar A y B");
            
            try {
                opc = leer.nextInt();
            } catch(Exception e) {
                leer.next();
                continue;
            }
            
            
            switch (opc) {
                case 1:
                    ArregloService.inicializar_a(arrA);
                    System.out.println("Inicializado A");
                    break;
                case 2:
                    ArregloService.inicializar_b(arrA, arrB);
                    System.out.println("Inicializado B");
                    break;
                case 3:
                    ArregloService.mostrar_array(arrA);
                    break;
                case 4:
                    ArregloService.ordenar_array(arrA);
                    break;
                case 5:
                    System.out.println("A");
                    ArregloService.mostrar_array(arrA);
                    System.out.println("******************************");
                    System.out.println("B");
                    ArregloService.mostrar_array(arrB);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        
        
    }
    
}
