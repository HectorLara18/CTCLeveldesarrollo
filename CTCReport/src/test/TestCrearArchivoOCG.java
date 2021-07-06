/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static application.CrearArchivos.*;

import static application.CrearArchivos.crearArchivo;
import static domain.ManejoArchivos.imprimeRuta;

/**
 *
 * @author hector
 */
public class TestCrearArchivoOCG {

    public static void main(String[] args) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        //CrearArchivos prueba = new CrearArchivos(); 
        String archivo = crearArchivo(directorio, 1, "prueba2", "prueba2");
        imprimeRuta(archivo);
    }
}
