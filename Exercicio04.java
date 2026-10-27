package guiaDidadicoPT2;

import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numerosDigitados = new int[5];
        for (int i = 0; i < numerosDigitados.length; i++) {
            System.out.printf("Digite o %d° numero: ", (i + 1));
            numerosDigitados[i] = sc.nextInt();
        }
        System.out.println("Primeiro numero digitado: " + numerosDigitados[0]);
        sc.close();
    }
}
