/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author User
 */
public class Restomain {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(1,6);
        Cliente cliente = new Cliente("Marcos","2255487895");
        Reserva reserva = new Reserva(LocalDate.of(2025,9,20),LocalTime.of(16,14),cliente, mesa);
        
        System.out.println("Usted, el senior "+ cliente.getNombre()+ " eligio la mesa: "+ mesa.getNumero()+" con capacidad para "+mesa.getCapacidad()+ " personas");
        System.out.println("En caso de algun problema lo llamaremos al numero "+cliente.getTelefono());
        System.out.println("la fecha y hora de reserva es para "+ reserva.getFecha()+ " a las " + reserva.getHora()+" hs");
    }
}
