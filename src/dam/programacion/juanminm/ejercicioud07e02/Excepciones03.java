/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.ejercicioud07e02;

import java.io.IOException;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Excepciones03 {
    public static int devuelveEntero(int num) throws Exception {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepción rana.");
            } else {
                throw new IOException("Lanzando excepción pezespada.");
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
            return 2;
        }
    }

    public static void main(String[] args) {
        int a = 99;
        for (int i = 0; i < 10; i++) {
            try {
                a = devuelveEntero(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                a = 99;
            }
        }

        System.out.println(a);
    }
}
