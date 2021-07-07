/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author hecto
 */
public class TestMetodoMAP {
    public static void main(String[] args) {
        var myMap = offlineMap();
        
        myMap.forEach((k,v) -> {
            System.out.println("Punto de Control: " + k + " Valor: " + v);
        });
        
    }
    
    public static Map offlineMap(){
        Map<String, Integer> mapOffline = new HashMap<String, Integer>();
        mapOffline.put("002/020", 0);
        mapOffline.put("002/021", 0);
        return mapOffline;
    }
    
}
