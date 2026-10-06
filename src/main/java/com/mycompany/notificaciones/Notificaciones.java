/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notificaciones;

/**
 *
 * @author brann
 */
public class Notificaciones {

    public static void main(String[] args) {
        Notificacion n1 = new Email("Bienvenido a la patria milagro");
        Notificacion n2 = new SMS("Bienvenido a la patria milagro");

        n1.enviar();
        n2.enviar();

        n1.enviar("Brannd@gmail.com");
        n2.enviar("3001234567");
        
        System.out.println("Total enviadas: " + Notificacion.totalEnviadas());
    }
}

