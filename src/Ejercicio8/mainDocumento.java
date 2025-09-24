/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class mainDocumento {
    public static void main(String[] args) {
        Usuario usuario=new Usuario("Mario","asdf@gmail.com");
        FirmaDigital firma = new FirmaDigital("1f2b3e",LocalDate.of(2025,9,20),usuario);
        Documento documento = new Documento("UML basico","ejercicios practicos", "1f2b3e",LocalDate.of(2025,9,20),usuario);
        
        System.out.println("El usuario "+usuario.getNombre()+" , con email: "+usuario.getEmail()+" nos envio el documento con sus respectivos datos: Titulo: "+documento.getTitulo()+" \n Contenido "+documento.getContenido());
        System.out.println("Subidos en la fecha: "+ firma.getFecha()+" por el usuario "+usuario.getNombre());
        System.out.println("La firma digital tiene el siguiente codigo hash "+firma.getCodigoHash()+" y la fecha de subida fue "+firma.getFecha());
    }
}
