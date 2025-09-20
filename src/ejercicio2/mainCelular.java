package ejercicio2;


public class mainCelular {
    public static void main(String[] args) {
       Usuario usuario =new Usuario("bruno","30262242");
       Celular celular = new Celular("0123456","nyso","s10");
       Bateria bateria = new Bateria("h1n1","10 mAmp");
       
        celular.setBateria(bateria);
        
        System.out.println("EL celular es de marca : "+ celular.getMarca()+" ,y modelo : "+ celular.getModelo());
        System.out.println("El nombre del titular  : "+ usuario.getNombre( )+ ",y el DNI es :" + usuario.getDNI());
        System.out.println("La bateria es modelo : "+ bateria.getModelo() +" ,y del capacidad : "+ bateria.getCapacidad());
    }
   
    
}
