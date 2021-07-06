/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static application.MetodosEstaticos.buscarElementos;
import static application.CrearArchivos.crearArchivo;
import static domain.ManejoArchivos.writeIfWordIsPresent;

/**
 *
 * @author hecto
 */
public class TestBuscarelementos {
    public static void main(String[] args) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        String ocgPath = directorio + 3911 + "_" + 20200220 + ".log";
        
        String archivoOffline = crearArchivo(directorio,2,"_Offline_","20200220");
        String archivoDelivery = crearArchivo(directorio,2,"_Delivery_Fail_","20200220");
        String archivoL3Inbound = crearArchivo(directorio,2,"L3_Inbound_Retry_","20200220");
        
        writeIfWordIsPresent(ocgPath,archivoOffline, "offline");
        writeIfWordIsPresent(ocgPath,archivoDelivery, "Delivery");
        writeIfWordIsPresent(ocgPath,archivoL3Inbound, "L3 Inbound Retry");
        
        
    }
    
}
