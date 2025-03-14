public class Numeros {
    
    public void ejecutar(Runnable metodo) {
        metodo.run(); // Ejecuta el método recibido
        System.out.println(); 
    }

    // Método while
    public void mostrarWhile() {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
    }

    // Método for
    public void mostrarFor() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}

