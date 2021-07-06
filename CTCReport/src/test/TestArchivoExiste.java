
package test;

import domain.*;
        
public class TestArchivoExiste {
    public static void main(String[] args) {
        String archivo = "ArchivoCreado.txt";
       AccesoArchivo accesoArchivo = new AccesoArchivo();
        System.out.println(accesoArchivo.existe(archivo));
    }
    
}
