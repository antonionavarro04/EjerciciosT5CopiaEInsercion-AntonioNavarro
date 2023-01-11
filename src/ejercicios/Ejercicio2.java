package ejercicios;

// ? Importamos la Clase Arrays
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ^ Definimos 2 arrays de 20 posiciones
        int[] arrayPrincipal = new int[20];
        int[] arrayFinal = new int[arrayPrincipal.length];

        // ^ Definimos una variable para las posiciones del nuevo array
        byte newPositions = 0;

        // ! Rellenamos el array con valores aleatorios entre 0 y 100
        for (byte pos = 0; pos < arrayPrincipal.length; pos++) {
            arrayPrincipal[pos] = (int) (Math.random() * 100 + 1);
            System.out.println("[" + pos + "] -> " + arrayPrincipal[pos]);
        }
        
        // ? Salto de Línea Triple
        System.out.println("\n----------------------\n");
        
        // ! Buscamos los numeros pares y los guardamos en el array final
        for (int numero : arrayPrincipal) {
            if (numero % 2 == 0) {
                arrayFinal[newPositions] = numero;
                newPositions++;
            }
        }

        // ! Buscamos los numeros impares y los guardamos en el array final comenzando desde la siguiente posicion vacia (newPositions)
        for (int numero : arrayPrincipal) {
            if (numero % 2 == 1) {
                arrayFinal[newPositions] = numero;
                newPositions++;
            }
        }

        // ! Mostramos los 2 arrays
        System.out.println(Arrays.toString(arrayPrincipal));
        System.out.println(Arrays.toString(arrayFinal));
    }
}
