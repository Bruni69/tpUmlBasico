/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Banco banco1 =new Banco("nacion","20-45678912-7");
       TarjetaCredito tarj1 = new TarjetaCredito("123456",LocalDate.of(2030, 9, 16),banco1);
       Cliente cliente1 = new Cliente("bruno",25456789);
       cliente1.setTarjetaCredito(tarj1);
       
        System.out.println("el banco que elegiste fue: "+banco1.getNombre()+" y tu numero de tarjeta de credito es: "+tarj1.getNumero()+ ".\n Ademas la fecha de su vencimiento es: "+tarj1.getFechaVencimiento());
        System.out.println("El nombre del cliente es "+cliente1.getNombre()+", y su DNI es "+cliente1.getDni());
    }   
}

