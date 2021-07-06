/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static domain.ManejoArchivos.*;

/**
 *
 * @author hecto
 */
public class TestwriteIf {
    public static void main(String[] args) {
        String archivoALeer = "ArchivoLectura.txt";
        String archivoAEscribir = "ArchivoSalida.txt";
        writeIfWordIsPresent(archivoALeer, archivoAEscribir, "offline");
    }
    
}
