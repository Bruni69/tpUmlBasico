import java.time.LocalDate;

public class JavaApplication10 {

     public static void main(String[] args) {
       byte[] datosDeImagen ={10, 20, 30};
       Foto foto = new Foto(datosDeImagen,"PNG");
       Titular titular = new Titular("bruno luduena","30262242",null);
       Pasaporte pasaporte = new Pasaporte("30262242", LocalDate.of(2025,9,16), foto,titular);
       
       
      
 
       titular.setPasaporte(pasaporte);
    
              
        System.out.println("pasaporte numero:"+ pasaporte.getNumero());
        System.out.println("nombre del titular:"+ titular.getNombre());
        System.out.println("formato de la imagen: "+ foto.getFormato());
         
        System.out.println("El pasaporte asociado al titular es: " + titular.getPasaporte().getNumero());
     }
    
}
