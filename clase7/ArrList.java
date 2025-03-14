import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Paola");
        nombres.add("Lola");
        nombres.add("Maria");
        nombres.add("Maria");
        System.out.println("Nombres:" +nombres);



        //HasMap
        HashMap<String, Integer> edades=new HashMap<>();
        edades.put("anna", 20); //aqui en lugar de poner .add se pone .put
        edades.put("Karla", 20);
        edades.put("Maria", 30);
        System.out.println("Edades"+edades);


        //HashSet, no hay elementos repetidos
        HashSet<String> capitales=new HashSet<>();
        capitales.add("Reynosa");
        capitales.add("Pchuca");
        capitales.add("Reynosa");
        capitales.add("Tamaulipas");
        System.out.println("capitales"+capitales);

        //Elementos de un coche usando HashSet
        HashSet<String> elementos=new HashSet<>();
        elementos.add("")


    }
}
