/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static application.JuntarArchivos.*;

/**
 *
 * @author hecto
 */
public class TestUnirArchivos {
    public static void main(String[] args) {
        generarArchivos("20210705");
        unirArchivos("20210705", "offline");
    }
}
