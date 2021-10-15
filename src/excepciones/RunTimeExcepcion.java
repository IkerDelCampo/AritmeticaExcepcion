/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Alumno Mañana
 */
public class RunTimeExcepcion extends RuntimeException{

    public RunTimeExcepcion(String mensaje) {
        super(mensaje);
    }
     
}
