/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("147qwe","123321");
        Computador computador = new Computador("sonsun","123321",placa);
        Propietario prop1 = new Propietario("bruno","35583533",computador);
        prop1.setComputador(computador);
       
        System.out.println("A continuacion se mostrara toda la informacion del ususario, computadora y placa madre:");
        System.out.println("Nombre: "+prop1.getNombre()+", DNI: "+prop1.getDni()+"\n Marca "+computador.getMarca()+" Numero de serie: "+computador.getNumeroSerie()+"\n modelo de placa "+placa.getModelo()+" numero de chipset "+placa.getChipset());
    }
    
    
}
