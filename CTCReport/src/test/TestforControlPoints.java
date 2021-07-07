/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static domain.MyControlPoint.controlPoints;

/**
 *
 * @author hecto
 */
public class TestforControlPoints {
    public static void main(String[] args) {
        String[] myControlPoints = controlPoints();
        for(int i = 0; i < myControlPoints.length; i++ ){
            System.out.println(myControlPoints[i]);
        }
    }
}
