import java.util.InputMismatchException;
import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        /* 
        System.out.println("Ingresa un mensaje");
        String mensaje=System.console().readLine();
        System.out.println(mensaje);
        */
        try {
        int resultado=10/0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        System.out.println("El numero ingresado fue:"+scanner.nextInt());
        System.out.println("Ingresa un numero doble");
        System.out.println("El numero ingresado fue:" +scanner.nextDouble());
        System.out.println("Ingresa un booleano");
        System.out.println("El booleano ingresado fue: "+scanner.nextBoolean());
        } catch (InputMismatchException e) {
            e.printStackTrace();{//toda la trazabilidad del error
            }
            System.out.println("El programa continua");
            
        }
        catch(Exception e){
        System.out.println("\n \t se generó una \"excepcion \" global ");
        }
    }
}
