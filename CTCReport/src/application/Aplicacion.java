/*
 * Programa para obtener informacion de logs del OCGv1
 */
package application;

import static application.ContarPuntosControl.*;
import static application.JuntarArchivos.*;
/**
 *
 * Buscar Elementos es un metodo estatico que recibe 2 argumentos
 * 1. Numero del OCG(1 o 2)
 * 2. fecha del log en formato yyyymmmdd se escribe como si fuera una palabra usando ""
 * 
 */
public class Aplicacion {
    
    public static void analizarLogs(String fecha){
        generarArchivos(fecha);
        ejecutarArchivos(fecha);
        contarOffline(fecha);
        contarDeliveryFailed(fecha);
        contarDeliveryretry(fecha);
        contarInboundRetry(fecha);
    }
    
}
