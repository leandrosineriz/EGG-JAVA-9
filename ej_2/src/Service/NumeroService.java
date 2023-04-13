/*
 1. Método mostrarValores que muestra cuáles son los dos números guardados.
 2. Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
 3. Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente 
    se deben redondear ambos valores.
 4. Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada 
    se debe obtener el valor absoluto del número.
 */
package Service;

import Class.ParDeNumero;

/**
 *
 * @author itsmi
 */
public class NumeroService {
    
    ParDeNumero pdn;

    public NumeroService() {
        this.pdn = new ParDeNumero();
    }
    
    public void mostrar_valores() {
        System.out.println("Valor 1: " + pdn.getN1());
        System.out.println("Valor 2: " + pdn.getN2());
    }
    
    public double devolver_mayor() {
        if (pdn.getN1() > pdn.getN2()) {
            return pdn.getN1();
        } else {
            return pdn.getN2();
        }
    }
    
    public double calcular_potencia() {
        if (this.devolver_mayor() == pdn.getN1()) {
            return Math.pow(Math.round(pdn.getN1()),Math.round(pdn.getN2()));
        } else {
            return Math.pow(Math.round(pdn.getN2()),Math.round(pdn.getN1()));
        }
    }
    
    public double calcular_raiz() {
        if (this.devolver_mayor() == pdn.getN1()) {
            return Math.sqrt(Math.round(pdn.getN2()));
        } else {
            return Math.sqrt(Math.round(pdn.getN1()));
        }
    }
}
