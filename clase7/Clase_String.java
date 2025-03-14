public class Clase_String {
    public static void main(String[] args) {
        
        String a="Hola mundo";
        String b ="Hola mundo";
        System.out.println(a.charAt(4));
        System.out.println(a.compareTo(b));
        System.out.println(a.length());
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf("la mundo"));//encontrar la posicion
        System.out.println(a.replace('H', 'K'));//para cambiar un carater 
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}
