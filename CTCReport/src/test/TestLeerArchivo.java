/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;
/**
 *
 * @author hecto
 */
public class TestLeerArchivo {
    public static void main(String[] args) {
        String archivo = "ArchivoLectura.txt";
    AccesoArchivo accesoArchivo = new AccesoArchivo();
    accesoArchivo.leerArchivo(archivo);
    }
    
    
}
