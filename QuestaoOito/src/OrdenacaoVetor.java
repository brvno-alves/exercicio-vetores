import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº elemento: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("\nVetor em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Elemento %d: %d%n", i + 1, vetor[i]);
        }

        scanner.close();
    }
}
