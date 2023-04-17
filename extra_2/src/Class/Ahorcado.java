/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
 * atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
 * jugadas máximas que puede realizar el usuario.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Ahorcado {
    private String[] palabra;
    private int cant_let_enc;
    private int cant_jug_max;

    public Ahorcado(String pal, int cant_jug_max) {
        this.cant_let_enc = 0;
        this.cant_jug_max = cant_jug_max;
        this.palabra = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {
            this.palabra[i] = pal.substring(i,i+1);
        }
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCant_let_enc() {
        return cant_let_enc;
    }

    public void setCant_let_enc(int cant_let_enc) {
        this.cant_let_enc = cant_let_enc;
    }

    public int getCant_jug_max() {
        return cant_jug_max;
    }

    public void setCant_jug_max(int cant_jug_max) {
        this.cant_jug_max = cant_jug_max;
    }
    
    
    
    
}
