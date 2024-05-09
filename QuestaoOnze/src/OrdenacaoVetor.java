import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("\nVetor em ordem crescente:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento %d: %d%n", i + 1, vetor[i]);
        }

        scanner.close();
    }
}
