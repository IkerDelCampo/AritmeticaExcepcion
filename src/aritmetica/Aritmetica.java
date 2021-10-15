/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import excepciones.OperacionExcepcion;
import javax.management.openmbean.OpenDataException;

public class Aritmetica {
    
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if(denominador == 0){
            throw new OperacionExcepcion("División entre 0");
        }
        return numerador/denominador;
    }
}
