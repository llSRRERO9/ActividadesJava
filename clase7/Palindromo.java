import java.util.Scanner;

public class Palindromo {

    public boolean esPalindromo(String frase){
        frase=frase.replace("\s", "");//es lo mismo que frase=frase.replace("","")
        System.out.println(frase);

        char[] caracteres=frase.toCharArray();
        for( int i=0; i<caracteres.length/2;i++){
            if(caracteres[i]!=caracteres[caracteres.length-1-i]){
                return false;
            }
        }
        return true;
    }
    //forma mas sencilla 
    static boolean esPalindromo2(String frase){
        frase=frase.replace("\s", "");
        String fraseInvertida=new StringBuilder(frase).reverse().toString();
        System.out.println(fraseInvertida);
        return frase.equals(fraseInvertida);
    }

    public static void main(String[] args ){
        System.out.println(esPalindromo2("anita lava la tina"));
        System.out.println(esPalindromo2("hola mundo"));
    }

}

