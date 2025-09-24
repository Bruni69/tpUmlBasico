/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author User
 */
public class mainClinica {
    public static void main(String[] args) {
        
        Profesional profesional = new Profesional("Mario caldo", "pediatra");
        Paciente paciente = new Paciente("Roberto", "pami");
        CitaMedica citaMedica = new CitaMedica(LocalDate.of(2025, 12, 25),LocalTime.of(15, 30, 0), paciente, profesional);
        
        
        System.out.println("El paciente "+paciente.getNombre()+" pidio consulta con el doctor "+profesional.getNombre());
        System.out.println("especialidad en "+profesional.getEspecialidad()+ " para la obra social "+ paciente.getObraSocial());
        System.out.println(" Su cita medica fue agendada para el dia "+citaMedica.getFecha()+" a las "+citaMedica.getHora()+" hs.");
        System.out.println("Gracias por confiar en nosotros");
    }
    
}
