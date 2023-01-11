package ejercicios;

// ? Importamos la Clase Arrays, Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ^ Definimos un array tablaEnteros de 10 posiciones y crearemos otra con las mismas posiciones
        int[] tablaEnteros = new int[10];
        int[] nuevaTabla = new int[0];

        // ^ Definimos una variable newPositions para las nuevas posiciones del Array
        byte newPositions = 0;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos al usuario los 10 valores de la primera tabla
        System.out.println("Introduce 10 valores:");
        for (byte pos = 0; pos < tablaEnteros.length; pos++) {
            System.out.print("[" + pos + "] -> ");
            tablaEnteros[pos] = read.nextInt();
        }

        // ! Mostramos los dos Arrays
        System.out.println(Arrays.toString(tablaEnteros));
        System.out.println(Arrays.toString(nuevaTabla));

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n------------------------------------------------------------------\n");
        
        // ! Quitamos los valores repetidos del primer array y los guardamos en el segundo
        for (int numero : tablaEnteros) {
            boolean encontrado = false;
            for (int valor : nuevaTabla) {
                if (numero == valor) {
                    encontrado = true;
                    break;
                }
            } if (!encontrado) {
                nuevaTabla = Arrays.copyOf(nuevaTabla, nuevaTabla.length + 1);
                nuevaTabla[newPositions] = numero;
                newPositions++;
            }
        }

        // ! Mostramos los dos Arrays
        System.out.println(Arrays.toString(tablaEnteros));
        System.out.println(Arrays.toString(nuevaTabla));
    }
} // € Hecho por Antonio Navarro
