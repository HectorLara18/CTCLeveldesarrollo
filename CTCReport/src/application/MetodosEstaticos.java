
package application;

import domain.*;
import static application.CrearArchivos.crearArchivo;
import domain.AccesoArchivo.*;
import static application.CrearArchivos.crearArchivo;
import static domain.ManejoArchivos.writeIfWordIsPresent;

public class MetodosEstaticos {
    
    public static void buscarElementos(int  OCG, String fecha){
        int numeroDelOCG = numeroOCG(OCG);
        var accesoArchivo = new AccesoArchivo();
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        
        String ocgPath = directorio + numeroDelOCG + "_" + fecha + ".log";
        
        String offlinePath = directorio + "_" + numeroDelOCG +  "_offline_" + fecha + ".txt";
        System.out.println("se crea archivo: " + offlinePath);
        String deliveryPath = directorio + "_" + numeroDelOCG + "_" + "delivery" + fecha + ".txt";
        System.out.println("se crea archivo: " + deliveryPath);
        String inboundRetryPath = directorio + "_" + numeroDelOCG + "_" + "inboundRetry" + fecha + ".txt";
        System.out.println("se crea archivo: " + inboundRetryPath);
        
        accesoArchivo.escribirPalabraClave(ocgPath, offlinePath, "B04: Group");
        System.out.println("se escribe en archivo offlinePath");
        accesoArchivo.escribirPalabraClave(ocgPath, deliveryPath, "Delivery");
        System.out.println("se escribe en archivo deliveryPath");
        accesoArchivo.escribirPalabraClave(ocgPath, inboundRetryPath, "L3 Inbound Retry");
        System.out.println("se escribe en archivo inboundRetryPath");

      
    }
    
    public static int numeroOCG(int numero){
        int numeroDeOCG = 0;
        
        if(numero == 1){
            numeroDeOCG = 3910;
        } else {
            numeroDeOCG = 3911; 
        }
        
        return numeroDeOCG;
    }
    
   
    
}
