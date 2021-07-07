/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import static application.MetodosEstaticos.*;
import domain.AccesoArchivo;
import static domain.ManejoArchivos.crearArchivo;


/**
 *
 * @author hecto
 */
public class JuntarArchivos {
    
    private static String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivosSalida\\OCG";
    private static String directorio2 = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivosLogs\\OCG";
    
    public static void generarArchivos(String fecha){        
        buscarElementos(1,fecha);
        buscarElementos(2,fecha);
    }
    
    public static void unirArchivos(String fecha, String tipoArchivo){
        var accesoArchivo = new AccesoArchivo();
        String archivo = directorio + "_" + tipoArchivo + "_" + fecha + ".txt";
        String archivoOrigenOCG1 = directorio2 + "_3910_" + tipoArchivo + "_" + fecha + ".txt";
        String archivoOrigenOCG2 = directorio2 + "_3911_" + tipoArchivo + "_" + fecha + ".txt";
        crearArchivo(archivo);
        accesoArchivo.copiarArchivo(archivoOrigenOCG1, archivo);
        accesoArchivo.copiarArchivo(archivoOrigenOCG2, archivo);
        System.out.println("se completa proceso para archivo: " + tipoArchivo);
    }
    
    public static void ejecutarArchivos(String fecha){
        String offline = "offline";
        String delivery = "delivery";
        String inboundRetry = "inboundRetry";
        unirArchivos(fecha, offline);
        unirArchivos(fecha, delivery);
        unirArchivos(fecha, inboundRetry);
    }
    
}
