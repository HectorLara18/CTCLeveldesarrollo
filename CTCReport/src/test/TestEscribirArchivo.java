package test;

import domain.*;

public class TestEscribirArchivo {
    public static void main(String[] args) {
        String archivoEntrada = "ArchivoLectura.txt";
        String archivoSalida = "ArchivoEscritura.txt";
        String palabra = "Offline";
        AccesoArchivo accesoArchivo = new AccesoArchivo();
        accesoArchivo.escribirPalabraClave(archivoEntrada, archivoSalida, palabra);
    }
}
