public class main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        //Para while 
        System.out.println("Números del 1 al 100 con while:");
        numeros.ejecutar(numeros::mostrarWhile);

        // Para for
        System.out.println("Números del 1 al 100 con for:");
        numeros.ejecutar(numeros::mostrarFor); //llama a mostrarconFor sin especificarlo directamente
    }
}


