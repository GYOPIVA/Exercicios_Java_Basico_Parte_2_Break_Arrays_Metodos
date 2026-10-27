package guiaDidadicoPT2;

public class Exercicio08 {
    public static void main(String[] args) {
        byte[] notas = {7,8,4,5};

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("index: %d, nota: %d%n", i + 1, notas[i]);
        }
    }
}
