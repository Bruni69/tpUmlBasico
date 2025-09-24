/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author User
 */
public class MainImp {
    public static void main(String[] args) {
        Impuesto monto = new Impuesto(180.00);
        Contribuyente contrib = new Contribuyente(" Juan Perez, "," 20-12345678-9");
        
        Calculadora calculando = new Calculadora();
        calculando.calcular(monto,contrib);
        
    }
   
}
