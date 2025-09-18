public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;        //la clase titular utiliza a la clase Pasaporte y hay una asociacion bidireccional

    //constructor

        public Titular(String nombre, String dni, Pasaporte pasaporte) {
            this.nombre = nombre;
            this.dni = dni;
            this.pasaporte = pasaporte;
            if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }

        }      
    

    //getters y setters
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

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
}
   
    
