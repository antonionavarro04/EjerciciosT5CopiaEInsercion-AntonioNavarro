package ejercicios;

// ? Importamos la Clase Scanner, Locale y Arrays
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ^ Definimos dos arrays de 15 posiciones
        int[] list = new int[15];
        int[] copyOfList = new int[list.length];

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos al usuario los 15 valores del array
        System.out.println("Introduce 15 valores en la tabla: ");
        for (byte pos = 0; pos < list.length; pos++) {
            System.out.print("[" + pos + "] -> ");
            list[pos] = read.nextInt();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------------\n");

        // ! Copiamos el ultimo valor en una variable auxiliar
        int aux = list[list.length - 1];

        // ! Copiamos los valores de la primera tabla a la segunda pero empezando desde la segunda posicion
        System.arraycopy(list, 0, copyOfList, 1, list.length - 1);

        // ! Sustituimos la primera posicion con la auxiliar
        copyOfList[0] = aux;

        // ! Mostramos las dos Tablas
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(copyOfList));
    }
} // € Hecho por Antonio Navarro
