public class LibreriaMath {
    public static void main(String[] args) {
        int valorAbsoluto=Math.abs(-10);
        System.out.println(valorAbsoluto);
        double redondeo=Math.round(-5.73);
        System.out.println(redondeo);
        double redAr=Math.ceil(3.7);//arriba
        double redAb=Math.floor(3.7);//abajo
        System.out.println(redAr+","+redAb);

        //potencia
        System.out.println(Math.pow(2,3));
        //raiz
        System.out.println(Math.sqrt(16));
        //numero aleatorio
        System.out.println(Math.random());// 0.0 - 1.0 es el rango de random si no especificamos 
    }
}
