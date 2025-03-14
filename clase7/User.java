public class User {

    //atributos
    private String nombre;
    private int edad;

      //construcores 
    public User(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args){
        User u1=new User("Juan", 20);
        User u2=new User("Paola", 25);// new es para crear objetos 
        User u3=new User("Paola", 25);
        System.out.println(u2.equals(u1));//equals dira que u2 y u3 son iguales poruqe estan almacenados en diferente memoria, compara objetos (memoria)
        if(u2.getNombre()==u3.getNombre()){// == compara valores 
            System.out.println("son i¿guales");
        }

        //boxing
        int calificacion=100;
        Integer calificaion2=calificacion;
        //unboxing
        int calificacion3 =calificacion;
    }

    

  
    

}
