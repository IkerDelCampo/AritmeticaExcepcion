/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static aritmetica.Aritmetica.division;

public class Test {
    public static void main(String[] args) {
        int res = 0;
        try {
            System.out.println(res=division(10, 2));
            res=division(10, 0);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {//extension try catch que se muestra siempre
            System.out.println("Siempre estoy");
        }
    }
}
