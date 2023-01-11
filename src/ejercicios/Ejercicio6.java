package ejercicios;

// ? Importamos la Clase Arrays
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ^ Definimos dos arrays de tamaño 100
        int[] arrayGenerado = new int[100];
        int[] arrayInverso = new int[arrayGenerado.length];

        // ^ Definimos una variable posición que empezará siendo la longitud del Array - 1 para rellenar el 2º Array de forma inversa
        int posicion = arrayGenerado.length - 1;

        // ! Rellenamos el array con valores del 1 al 100
        for (byte pos = 0; pos < arrayInverso.length; pos++) {
            arrayGenerado[pos] = pos + 1;
        }

        // ! Copiamos en orden inverso los valores del array
        for (int numero : arrayGenerado) {
            arrayInverso[posicion] = numero;
            posicion--;
        }

        // ! Imprimimos los dos Arrays
        System.out.println(Arrays.toString(arrayGenerado));
        System.out.println(Arrays.toString(arrayInverso));
    }
} // € Hecho por Antonio Navarro
