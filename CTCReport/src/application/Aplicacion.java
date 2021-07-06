/*
 * Programa para obtener informacion de logs del OCGv1
 */
package application;

import static application.MetodosEstaticos.*;

/**
 *
 * Buscar Elementos es un metodo estatico que recibe 2 argumentos
 * 1. Numero del OCG(1 o 2)
 * 2. fecha del log en formato yyyymmmdd se escribe como si fuera una palabra usando ""
 * 
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        buscarElementos(2,"20200220");
        
    }
    
}
