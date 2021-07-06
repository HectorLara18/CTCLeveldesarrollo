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
public class TestExiste {
    public static void main(String[] args) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        String ocgPath = directorio + 3911 + "_" + 20200220 + ".txt";
        
        AccesoArchivo accesoArchivo = new AccesoArchivo();
        accesoArchivo.existe(ocgPath);
        System.out.println(accesoArchivo.existe(ocgPath));
    }
}
