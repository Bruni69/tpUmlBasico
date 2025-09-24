/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author User
 */
public class GeneradorQr {
    void generar(double valor, Usuario usuario){
        CodigoQr codigo = new CodigoQr(valor, usuario);
        
         System.out.println("Se ha generado un QR con el valor de $" + codigo.getValor());
         System.out.println("Para el usuario: " + codigo.getUsuario().getNombre() + " con email " + codigo.getUsuario().getEmail());
    
    }
    
}
