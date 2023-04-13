/*
1. Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2. Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3. Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4. Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las 
últimas 10 posiciones del arreglo B con 0.5.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author itsmi
 */
public class ArregloService {
    
    public static void inicializar_a(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) Math.random()*10;
        }
    }
    
    public static void mostrar_array(float[] arr) {
        for(float a : arr) {
            System.out.print(a);
            System.out.println("");
        }
    }
    
    public static void ordenar_array(float[] arr) {
        Arrays.sort(arr);
    }
    
    public static void inicializar_b(float[] arrA, float[] arrB) {
        for (int i = 0; i < 10; i++) {
            arrB[i] = arrA[i];
        }
        Arrays.fill(arrB, 10, 20, (float) 0.5);
    }
}
