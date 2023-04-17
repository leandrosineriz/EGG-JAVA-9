/*
 * Definir los siguientes métodos en AhorcadoService:
 * 1. Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la 
 * palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después 
 * ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice 
 * del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
 * 2. Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como 
 * se usa el vector.length.
 * 3. Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada 
 * es parte de la palabra o no. También informará si la letra estaba o no.
 * 4. Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
 * sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false 
 * si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
 * 5. Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 * 6. Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará 
 * cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
 */
package Services;

import Class.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class AhorcadoService {
    
    public Ahorcado crear_juego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la palabra secreta:");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos:");
        int intentos = leer.nextInt();
        return new Ahorcado(palabra, intentos);
    }
    
    public int longitud(Ahorcado a1){
        return a1.getPalabra().length;
    }
    
    public boolean buscar(Ahorcado a1,String letra){
        for(String l: a1.getPalabra()){
            if(letra.equals(l)){
                System.out.println(letra + " esta en la palabra.");
                return true;
            }
        }
        System.out.println(letra + " NO esta en la palabra.");
        return false;
    }
    
    public boolean encontradas(Ahorcado a1, String letra){
        if (this.buscar(a1, letra)) {
            int cant = 0;
            for(String l: a1.getPalabra()){
                if(l.equals(letra)){
                    cant++;
                }
            }
            a1.setCant_let_enc(a1.getCant_let_enc()+cant);
            System.out.println("Se encontro " + cant + " veces la palabra.");
            return true;
        } else {
            a1.setCant_jug_max(a1.getCant_jug_max()-1);
            return false;
        }
        
    }
    
    public void intentos(Ahorcado a1){
        System.out.println("Se resto una oportunidad. Quedan: " + a1.getCant_jug_max() + "\n" 
                + "Cantidad de letras encontradas: " + a1.getCant_let_enc() + "/" + a1.getPalabra().length);
    }
    
    public boolean juego(Ahorcado a1){
        String letra;
        ArrayList<String> let_encontradas = new ArrayList<>(); 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while(a1.getCant_jug_max()>0){
            
            System.out.println("Ingrese una letra: ");
            letra = leer.next().toLowerCase();
            
            while(let_encontradas.contains(letra)){
                System.out.println("La letra ya fue encontrada. Ingrese otra: ");
                letra = leer.next().toLowerCase();
            }
            
            if(this.encontradas(a1, letra)){
                let_encontradas.add(letra);
            }
            
            this.intentos(a1);
            System.out.println("*************************************************\n");
            
            if(a1.getCant_let_enc() >= a1.getPalabra().length){
                System.out.println("Ganaste!");
                System.out.print("La palabra era: "   );
                for(String s : a1.getPalabra()){
                    System.out.print(s);
                }
                System.out.println("");
                return true;
            }
        }
        
        System.out.println("Perdiste :(");
        System.out.println("Te quedaste sin intentos, encontraste: " + 
                a1.getCant_let_enc() + "/" + a1.getPalabra().length);
        return false;
    }
    
}
