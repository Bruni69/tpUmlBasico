/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author User
 */
public class MainQr {
    public static void main(String[] args) {
        Usuario user = new Usuario("Roberto Carlos","carlosrober@hotmail.com");
        
        GeneradorQr generador = new GeneradorQr();
        generador.generar(1800.00,user);
    }
}
