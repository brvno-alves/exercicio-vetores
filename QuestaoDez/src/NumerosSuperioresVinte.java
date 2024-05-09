import java.util.Scanner;

public class NumerosSuperioresVinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        boolean encontrouNumeroMaiorQueVinte = false;

        for (int i = 0; i < n; i++) {
            if (vetor[i] > 20) {
                System.out.printf("Número %d encontrado na posição %d%n", vetor[i], i);
                encontrouNumeroMaiorQueVinte = true;
            }
        }

        if (!encontrouNumeroMaiorQueVinte) {
            System.out.println("Não existem números maiores que vinte no vetor.");
        }

        scanner.close();
    }
}
