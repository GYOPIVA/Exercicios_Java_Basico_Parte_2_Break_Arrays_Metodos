package guiaDidadicoPT2;

import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numerosDigitados = new int[3];

        for (int i = 0; i < numerosDigitados.length; i++) {
            System.out.printf("Digite o %d° numero: ", (i + 1));
            numerosDigitados[i] = sc.nextInt();
        }
        System.out.println("Subistituindo index na 2° posição...");
        numerosDigitados[1] = 99;

        for (int numeros :  numerosDigitados) {
            System.out.println(numeros);
        }
    }
}
