package guiaDidadicoPT2;

import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %d° nome: ", (i + 1));
            nomes[i] = sc.nextLine();
        }

        System.out.println("Último nome: " + nomes[nomes.length - 1]);

        sc.close();
    }
}