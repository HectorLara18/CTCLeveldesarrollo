/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static domain.MyControlPoint.*;
import java.util.Map;

/**
 *
 * @author hecto
 */
public class TestOfflineMap {
    public static void main(String[] args) {
       Map<String, Integer> myMap = offlineMap();
       myMap.forEach((k,v) -> {
           System.out.println("Control Point: " + k + " Value: " + v);
       });
    }
}
