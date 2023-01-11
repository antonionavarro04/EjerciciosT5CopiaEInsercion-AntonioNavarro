package ejercicios;

// ? Importamos la Clase Arrays, Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ^ Definimos 2 arrays de 10 posiciones
        int[] arrayPrincipal = new int[10];
        int[] arrayPares = new int[0];
        int[] arrayImpares = new int[0];

        // ^ Definimos una variable para las posiciones del array pares y otra para impares
        byte posPares = 0, posImpares = 0;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos al Usuario los valores del array
        for (byte pos = 0; pos < arrayPrincipal.length; pos++) {
            System.out.print("[" + pos + "] -> ");
            arrayPrincipal[pos] = read.nextInt();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n----------------------\n");
        
        // ! Buscamos los numeros pares e impares los guardamos en su array correspondiente
        for (int numero : arrayPrincipal) {
            if (numero % 2 == 0) {
                arrayPares = Arrays.copyOf(arrayPares, arrayPares.length + 1);
                arrayPares[posPares] = numero;
                posPares++;
            } else {
                arrayImpares = Arrays.copyOf(arrayImpares, arrayImpares.length + 1);
                arrayImpares[posImpares] = numero;
                posImpares++;
            }
        }

        // ! Mostramos los 3 arrays
        System.out.println(Arrays.toString(arrayPrincipal));
        System.out.println(Arrays.toString(arrayPares));
        System.out.println(Arrays.toString(arrayImpares));
    }
}
