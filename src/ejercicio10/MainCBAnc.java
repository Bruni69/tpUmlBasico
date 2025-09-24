/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author User
 */
public class MainCBAnc {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("h1n1","commit ej10");
        Titular titular = new Titular("Emanuel Quiroz","25456789", null);
        CuentaBancaria cuenta = new CuentaBancaria("789654123",0.00,titular, clave);
        
        cuenta.setTitular(titular);
        titular.setCuenta(cuenta);
        
        System.out.println("Bienvenido cliente "+titular.getNombre()+titular.getDni());
        System.out.println("Su nueva cuenta bancaria es "+cuenta.getCbu()+" su saldo es "+cuenta.getSaldo());
        System.out.println("La clave que usted eligio es: "+clave.getCodigo()+" y el mensaje de ultima modificacion es: "+clave.getUltimaModificacion());
        System.out.println(titular.getCuenta().getCbu());
    }
 
}
