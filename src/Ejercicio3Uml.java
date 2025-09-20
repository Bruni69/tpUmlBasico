package ejercicio3uml;
import ejercicio3uml.Autor;
import ejercicio3uml.Editorial;
import ejercicio3uml.Libro;
public class Ejercicio3Uml {

    public static void main(String[] args) {
        Autor autor = new Autor("Marco Aurelio", "Roma");
        Editorial editorial = new Editorial("La marquesina","Tres arboles 987 "); 
        Libro libro= new Libro("lo que el viento se llevo",44857236, autor, editorial);
       
        System.out.println("Titulo tiene como nommbre: " + libro.getTitulo()+". " + " ISBN: "+ libro.getIsbn());
        System.out.println("El autor es: "+autor.getNombre()+ " y su nacionalidad de "+autor.getNacionalidad());
        System.out.println("La editorial tiene como nombre: "+ editorial.getNombre()+ " y su direccion es "+ editorial.getDireccion());
    }
    
}
