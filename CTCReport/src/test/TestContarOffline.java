/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static application.ContarPuntosControl.*;
import static domain.ManejoArchivos.*;
import static domain.MyControlPoint.*;

/**
 *
 * @author hecto
 */
public class TestContarOffline {
    public static void main(String[] args) {
        contarOffline("20210705");
        contarDeliveryFailed("20210705");
        contarDeliveryretry("20210705");
        contarInboundRetry("20210705");
    }
}
