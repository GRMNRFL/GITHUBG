package exemples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//busca l'element més xicotet i el fica al principi
public class ejemplo {

	public static void main(String[] args) {
        double[] array = new double[20];
        Random rand = new Random();

        // Generar array de valores aleatorios entre 0 y 50
        Arrays.setAll(array, i -> rand.nextDouble() * 50);
        System.out.println("Array original: " + Arrays.toString(array));

        // Ordenar array
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));

        // Obtener valores mínimo y máximo
        double min = array[0];
        double max = array[array.length - 1];
        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor máximo: " + max);

        // Rellenar la primera mitad del array con la parte entera de min y la segunda mitad con la parte entera de max
        int minEntero = (int) min;
        int maxEntero = (int) max;
        Arrays.fill(array, 0, array.length / 2, minEntero);
        Arrays.fill(array, array.length / 2, array.length, maxEntero);
        System.out.println("Array rellenado: " + Arrays.toString(array));
    }
}