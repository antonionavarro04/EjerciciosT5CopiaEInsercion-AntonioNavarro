package ejercicios;

// ? Importamos la Clase Arrays, Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void imprimirMenu() {
        System.out.println("a: Mostrar valores");
        System.out.println("b: Introducir valor");
        System.out.println("c: Salir");
        System.out.print(">>> ");
    }

    public static void mostrarValores(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void insertarValor(int[] array, int valor, byte posicion) {
        array[posicion] = valor;
    }

    public static void main(String[] args) {
        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos un array de 10 posiciones y una variable para consultar sus posiciones y valores
        int[] array = new int[10];
        int valor;
        byte posicion;

        // ^ Definimos una variable char
        char opcion;

        do { // ! Mediante un bucle mostramos al usuario un menu
            imprimirMenu();
            opcion = read.next().charAt(0);
            
            switch (opcion) { // ! Segun la opcion elegida por el usuario ejecutamos una accion
                case 'a': // ? Mostramos los valores del array
                    mostrarValores(array);
                    break;
                case 'b': // ? Pedimos al usuario un valor y una posicion para insertarlo en el array
                    System.out.print("Que valor quieres insertar? -> ");
                    valor = read.nextInt();
                    System.out.print("En que posicion quieres insertar el valor (0-9)? -> ");
                    posicion = read.nextByte();
                    insertarValor(array, valor, posicion);
                    break;
                case 'c': // ? Salimos del programa
                    break;
                default: // ? Si el usuario introduce una opcion no valida mostramos un mensaje de error
                    System.err.println("Error! Opcion no valida!");
                    break;
            }

            // ! Si la opción es diferente a 'c' mostramos un mensaje de espera
            if (opcion != 'c') {
                // ! Pedimos que pulse una tecla para continuar
                System.out.print("\nPulsa 'enter' para continuar... ");
                read.nextLine(); read.nextLine();
            }

            // ? Salto de Línea Triple
            System.out.println("\n----------------------\n");
        } while (opcion != 'c');
        
        // ! Mostramos al usuario que el programa ha finalizado
        System.out.println("Programa Finalizado...");

        // ^ Cerramos el Scanner tras su uso
        read.close();
    }
} // € Hecho por Antonia Navarro
