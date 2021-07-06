/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.*;
import java.util.*;

/**
 *
 * @author hecto
 */
public class CrearArchivos {
    
    public static String crearArchivo(String directorio, int ocg, String valor, String fecha){
        
        String path = directorio + "_" + "OCG" + ocg + "_" + valor + "_" + fecha + ".txt"; 
        
        File archivo = new File(path);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se genero archivo");
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
        return path;
    }
    
}
