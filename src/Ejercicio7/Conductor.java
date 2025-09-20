/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author User
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
//constructor
    public Conductor(String nombre, String licencia, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.setVehiculo(vehiculo);
        
    }
//get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null){
            this.vehiculo.setConductor(this);
        }
    }
    
}
