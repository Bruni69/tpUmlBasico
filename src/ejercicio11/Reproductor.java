/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author User
 */
public class Reproductor {
    public Reproductor() {
    }
    void reproducir(Cancion cancion){
        System.out.println("Reproduciendo "+cancion.getTitulo()+" del artista "+ cancion.getArtista().getNombre());
        
    }
      
}
