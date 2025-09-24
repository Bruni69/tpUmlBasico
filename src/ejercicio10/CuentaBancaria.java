/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author User
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad clave;

    public CuentaBancaria(String cbu, double saldo, Titular titular, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = clave;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    
    
}
