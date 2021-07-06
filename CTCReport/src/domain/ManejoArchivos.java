/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.*;

/**
 *
 * @author hecto
 */
public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se a creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void imprimeRuta(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        System.out.println(archivo.getAbsolutePath());
    }

    public static void anexarArchivos(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivos(String nombreArchivo) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            var lectura = entrada.readLine();
            while (lectura !=   null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void writeIfWordIsPresent(String file2read, String file2write, String word){
        File fileToRead = new File(file2read);
        File fileToWrite = new File(file2write);
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(file2read));
            var lectura = entrada.readLine();
            while (lectura !=   null) {
                if(entrada.readLine().contains(word)){
                    try{
                        PrintWriter salida = new PrintWriter(new FileWriter(fileToWrite, true));
                        salida.println(entrada);
                    }catch (FileNotFoundException ex) {
                        ex.printStackTrace(System.out);
                    } catch (IOException ex) {
                        ex.printStackTrace(System.out);
                    }
                }
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
}
