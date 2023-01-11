package ejercicios;

// ? Importamos la Clase Arrays, Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos un array de 10 posiciones
        int[] array = new int[10];

        // ^ Definimos una variable char
        char opcion;

        // ! Mediante un bucle mostramos al usuario un menu
        do {
            imprimirMenu();
            opcion = read.next().charAt(0);

            switch (opcion) {
                case 'a':
                    mostrarValores(array);
                    break;
                default:
                    System.err.println("Error");
                    break;
            } while (opcion != 'c');
        }
    }
}
