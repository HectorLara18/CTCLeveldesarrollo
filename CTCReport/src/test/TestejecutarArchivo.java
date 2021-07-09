/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static application.JuntarArchivos.*;
import static application.ContarPuntosControl.*;

/**
 *
 * @author hecto
 */
public class TestejecutarArchivo {
    public static void main(String[] args) {
        generarArchivos("20210705");
        ejecutarArchivos("20210705");
    }
    
    public static void analizarLogs(String fecha){
        generarArchivos(fecha);
        ejecutarArchivos(fecha);
        contarOffline(fecha);
        contarDeliveryFailed(fecha);
        contarDeliveryretry(fecha);
        contarInboundRetry(fecha);
    }
}
