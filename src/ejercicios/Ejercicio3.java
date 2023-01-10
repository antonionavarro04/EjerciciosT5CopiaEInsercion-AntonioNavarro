package ejercicios;

// ? Importamos la Clase Arrays, Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static boolean esPrimo(int numero) {
        boolean state = false;

        if (numero <= 1) {
            // ? Si el numero es 1 o menor no hacemos nada
        } else {
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero / divisor == 0) {
                    break;
                } else {
                    state = true;
                }
            }
        }

        return state;
    }
    public static void main(String[] args) {
        // ^ Definimos 2 arrays de 20 posiciones
        int[] arrayPrincipal = new int[10];
        int[] arrayFinal = new int[arrayPrincipal.length];

        // ^ Definimos una variable para las posiciones de los arrays finales
        byte newPositions = 0;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Rellenamos el array con valores aleatorios entre 0 y 100
        for (byte pos = 0; pos < arrayPrincipal.length; pos++) {
            System.out.print("[" + pos + "] -> ");
            arrayPrincipal[pos] = read.nextInt();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n----------------------\n");
        
        // ! Buscamos los numeros primos y los guardamos en el array final
        for (int numero : arrayPrincipal) {
            if (esPrimo(numero)) {
                arrayFinal[newPositions] = numero;
                newPositions++;
            }
        }

        // ! Buscamos los numeros no primos y los guardamos en el array final comenzando desde la siguiente posicion vacia (newPositions)
        for (int numero : arrayPrincipal) {
            if (!esPrimo(numero)) {
                arrayFinal[newPositions] = numero;
                newPositions++;
            }
        }

        // ! Mostramos los 2 arrays
        System.out.println(Arrays.toString(arrayPrincipal));
        System.out.println(Arrays.toString(arrayFinal));
    }
}
