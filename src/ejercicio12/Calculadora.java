/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author User
 */
public class Calculadora {
    void calcular(Impuesto monto, Contribuyente contrib){
        System.out.println("El monto a pagar del contribuyente "+contrib.getNombre()+" cuil "+contrib.getCuil() +"es "+ monto.getMonto()+" pesos");
    }
    
}
