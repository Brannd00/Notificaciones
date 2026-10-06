/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author brann
 */
public class SMS extends Notificacion{

    public SMS(String mensaje) {
        super(mensaje);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando SMS: " + mensaje);
        registrarEnvio();
    }

    @Override
    public void enviar(String destinatario) {
        System.out.println("Enviando SMS al numero " + destinatario + ". Mensaje: " + mensaje);
        registrarEnvio();
    }


}
