/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author User
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computador computador;

    public Propietario(String nombre, String dni, Computador computador) {
        this.nombre = nombre;
        this.dni = dni;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
        if (computador !=null && computador.getPropietario() == null){
            computador.setPropietario(this);
        }
    }
    
}
