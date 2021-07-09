/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;
import static domain.MyControlPoint.*;
import static domain.ManejoArchivos.*;
import java.io.*;

/**
 *
 * @author hecto
 */
public class ContarPuntosControl {

    private static String directorio2 = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivosSalida\\OCG";
    private static String[] myControlPointsList = controlPoints();
    private static String[] myControlPointsretryList = controlPointsRetry();

    public static void contarOffline(String fecha) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivoParaExcel\\OCG_Offline_";
        String archivoSalida = directorio + fecha + ".txt";
        String archivoEntrada = directorio2 + "_offline_" + fecha + ".txt";

        crearArchivo(archivoSalida);
        File archivo = new File(archivoSalida);
        var offlineMapCount = offlineMap();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivoEntrada));
            var lectura = entrada.readLine();
            while (lectura != null) {
                for (int i = 0; i < myControlPointsList.length; i++) {
                    if (lectura.contains(myControlPointsList[i])) {
                        int valor = (int) offlineMapCount.get(myControlPointsList[i]);
                        int valorIncrementado = ++valor;
                        offlineMapCount.put(myControlPointsList[i], valorIncrementado);
                    }
                }
                lectura = entrada.readLine();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                for (int i = 0; i < myControlPointsList.length; i++) {
                    salida.println(myControlPointsList[i] + " " + offlineMapCount.get(myControlPointsList[i]));
                }
                salida.close();
                System.out.println("Se a escrito al archivo");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    public static void contarDeliveryFailed(String fecha) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivoParaExcel\\OCG_DeliveryFailed_";
        String archivoSalida = directorio + fecha + ".txt";
        String archivoEntrada = directorio2 + "_delivery_" + fecha + ".txt";

        crearArchivo(archivoSalida);
        File archivo = new File(archivoSalida);
        var retryMapCount = retryMap();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivoEntrada));
            var lectura = entrada.readLine();
            while (lectura != null) {
                lectura = entrada.readLine();
                for (int i = 0; i < myControlPointsretryList.length; i++) {
                    if (lectura.contains(myControlPointsretryList[i]) && lectura.contains("Delivery Failed")) {
                        int valor = (int) retryMapCount.get(myControlPointsretryList[i]);
                        int valorIncrementado = ++valor;
                        retryMapCount.put(myControlPointsretryList[i], valorIncrementado);
                    }
                }
                lectura = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                for (int i = 0; i < myControlPointsretryList.length; i++) {
                    salida.println(myControlPointsretryList[i] + " " + retryMapCount.get(myControlPointsretryList[i]));
                }
                salida.close();
                System.out.println("Se a escrito el archivo");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    public static void contarDeliveryretry(String fecha) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivoParaExcel\\OCG_DeliveryRetry_";
        String archivoSalida = directorio + fecha + ".txt";
        String archivoEntrada = directorio2 + "_delivery_" + fecha + ".txt";

        crearArchivo(archivoSalida);
        File archivo = new File(archivoSalida);
        var retryMapCount = retryMap();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivoEntrada));
            var lectura = entrada.readLine();
            while (lectura != null) {
                lectura = entrada.readLine();
                for (int i = 0; i < myControlPointsretryList.length; i++) {
                    if (lectura.contains(myControlPointsretryList[i]) && lectura.contains("Delivery Retry")) {
                        int valor = (int) retryMapCount.get(myControlPointsretryList[i]);
                        int valorIncrementado = ++valor;
                        retryMapCount.put(myControlPointsretryList[i], valorIncrementado);
                    }
                }
                lectura = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                for(int i = 0; i < myControlPointsretryList.length; i++){
                    salida.println(myControlPointsretryList[i] + " " + retryMapCount.get(myControlPointsretryList[i]));
                }
                salida.close();
            }catch(FileNotFoundException ex){
                ex.printStackTrace(System.out);
            }catch(IOException ex){
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public static void contarInboundRetry(String fecha){
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\ArchivoParaExcel\\OCG_inboundRetry_";
        String archivoSalida = directorio + fecha + ".txt";
        String archivoEntrada = directorio2 + "_inboundRetry_" + fecha + ".txt";
        
        crearArchivo(archivoSalida);
        File archivo = new File(archivoSalida);
        var inboundRetryMapCount = offlineMap();
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivoEntrada));
            var lectura = entrada.readLine();
            while(lectura != null){
                for(int i = 0; i < myControlPointsList.length; i++){
                    if(lectura.contains(myControlPointsList[i])){
                        int valor = (int) inboundRetryMapCount.get(myControlPointsList[i]);
                        int valorIncrementado = ++valor;
                        inboundRetryMapCount.put(myControlPointsList[i], valorIncrementado);
                    }
                }
                lectura = entrada.readLine();
            }
        }catch(FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }finally {
            try{
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                for(int i = 0; i < myControlPointsList.length; i++){
                    salida.println(myControlPointsList[i] + " " + inboundRetryMapCount.get(myControlPointsList[i]));
                }
                salida.close();
                System.out.println("se a escrito el archivo");
            }catch(FileNotFoundException ex){
                ex.printStackTrace(System.out);
            }catch(IOException ex){
                ex.printStackTrace(System.out);
            }
        }
    }
    
    

}
