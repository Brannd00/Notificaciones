/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author brann
 */
public abstract class Notificacion {
    protected String mensaje;
    private static int totalEnviadas=0;
    
    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public abstract void enviar();
    public abstract void enviar(String destinatario);

      protected static void registrarEnvio() {
        totalEnviadas++;
    }
       public static int totalEnviadas() {
        return totalEnviadas;
    }
}
