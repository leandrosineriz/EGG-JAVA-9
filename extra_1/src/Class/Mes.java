/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class Mes {

    private String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mes_secreto;

    public Mes() {
        this.mes_secreto = this.meses[(int) (Math.random() * 12)];
    }

    public String getMes_secreto() {
        return mes_secreto;
    }

    public String adivinar_mes(String mes) {
        
        if (this.mes_secreto.equals(mes)) {
            return "Correcto";
        }
        
        return "Falso";
    }

    public void mostrar_meses() {
        for(String a : this.meses){
            System.out.println(a);
        }
    }
    
    

}
