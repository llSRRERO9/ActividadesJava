public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    for (String s : args){
        System.out.println(s);
        System.out.println(',');
    }
    System.out.println("Argumento 1="+args[0]);
    System.out.println("Argumento 2="+args[1]);
    System.out.println("Argumento 3="+args[2]);
    System.out.println("Argumento 4="+args[3]);
    }
}
