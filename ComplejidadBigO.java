public class ComplejidadBigO {

    public static int primerElemento(int[] array) {
        return array[0];
    }

    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.println(elemento);
        }
    }

    public static void imprimirPares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    public static int busquedaBinaria(int[] array, int objetivo) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == objetivo) {
                return medio;
            } else if (array[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] miArray = {1, 2, 3, 4, 5};

        System.out.println("Primer elemento: " + primerElemento(miArray));
        System.out.println("Imprimiendo array:");
        imprimirArray(miArray);
        System.out.println("Imprimiendo pares:");
        imprimirPares(miArray);

        int[] arrayOrdenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int objetivo = 7;
        int indice = busquedaBinaria(arrayOrdenado, objetivo);
        System.out.println("Indice de " + objetivo + ": " + indice);
    }
}