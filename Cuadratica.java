public class Cuadratica {
    public static void imprimirPares(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.println("(" + arreglo[i] + ", " + arreglo[j] + ")");
            }
        }
    }
}