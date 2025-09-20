/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author User
 */
public class MainAuto {
    public static void main(String[] args) {
        Motor motor = new Motor("diesel","h1n1");
        Conductor conductor = new Conductor("Roberto", "29654987",null);
        Vehiculo vehiculo = new Vehiculo("abc 123","drof",motor,conductor);
       
        conductor.setVehiculo(vehiculo);
        System.out.println("El vehiculo es de tipo: "+motor.getTipo()+ "y su modelo es: "+motor.getNumeroSerie());
        System.out.println("El motor es: "+motor.getTipo()+" "+motor.getNumeroSerie());
        System.out.println("El conductor es : "+conductor.getNombre()+" con licencia: "+conductor.getLicencia());
        
    }
}
