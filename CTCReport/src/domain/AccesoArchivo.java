package domain;

import java.io.*;
import java.util.*;

public class AccesoArchivo {

    public AccesoArchivo() {
    }

    ;
    
    public boolean existe(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    public void leerArchivo(String nombreArchivo) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void leerPalabraClave(String nombreArchivo, String palabra) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                if (lectura.contains(palabra)) {
                    System.out.println(lectura);
                    lectura = entrada.readLine();
                } else {
                    lectura = entrada.readLine();
                }
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void escribirLinea(String archivoSalida, String palabra) {
        File archivo = new File(archivoSalida);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(palabra);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void escribirPalabraClave(String archivoEntrada, String archivoSalida, String PalabraClave) {
        File fileInput = new File(archivoEntrada);
        File fileOutput = new File(archivoSalida);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(fileInput));
            var lectura = entrada.readLine();
            while (lectura != null) {
                if (lectura.contains(PalabraClave)) {
                    this.escribirLinea(archivoSalida, lectura);
                    lectura = entrada.readLine();
                } else {
                    lectura = entrada.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
