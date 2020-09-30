package ejercicio_5;

import java.util.Scanner;

/**
 * 5. Recoger por teclado un número que introduzca el usuario y mostrar por
 * consola el carácter al que pertenece en la tabla Ascii. Ejemplo: 97 = a en
 * Ascii.
 *
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un número de la tabla Ascii: ");
        numero = teclado.nextInt();
        char caracter = (char) numero;

        System.out.println(numero + " equivale a: " + caracter + " en la tabla Ascii");
    }

}
