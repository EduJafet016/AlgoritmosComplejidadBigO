import java.util.ArrayList;

public class Mixto {
    // Memoria estática: el arreglo es de tamaño fijo
    static int[] edades = new int[5];

    public static void main(String[] args) {
        edades[0] = 20;
        edades[1] = 22;

        // Memoria dinámica: ArrayList crece según necesidad
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Edú");
        nombres.add("Jafet");

        // Mostrar ambos contenidos
        System.out.println("Edades:");
        for (int edad : edades) {
            System.out.println(edad);
        }

        System.out.println("Nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}