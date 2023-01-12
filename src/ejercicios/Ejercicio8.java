package ejercicios;

// ? Importamos la Clase Arrays, Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos una variable posiciones de tipo short
        short posiciones;

        // ^ Definimos una variable valorInicial e otra que sea incremento
        int valorInicial = 0;
        int incremento = 0;

        // ! Pedimos al usuario cuantas posiciones tiene nuestro array
        do {
            System.out.print("Cuantas posiciones tiene el array? -> ");
            posiciones = read.nextShort();
        } while (posiciones <= 0);

        // ^ Definimos un array de tamaño posiciones
        int[] array = new int[posiciones];

        // ! Pedimos al usuario un valor inicial y un incremento
        System.out.print("Que valor inicial quieres? -> ");
        valorInicial = read.nextInt();
        System.out.print("Que incremento quieres? -> ");
        incremento = read.nextInt();

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------\n");
        
        // ! Rellenamos el array con los valores pedidos
        for (short pos = 0; pos < posiciones; pos++) {
            array[pos] = valorInicial;
            valorInicial += incremento;
        }

        // ! Mostramos el array
        System.out.println(Arrays.toString(array));
    }
} // € Hecho por Antonia Navarro
