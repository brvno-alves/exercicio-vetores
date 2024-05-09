import java.util.Scanner;

public class VetorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nVetor original:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Elemento %d: %d%n", i + 1, vetor[i]);
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] == 5) {
                vetor[i] = 1;
            }
        }

        System.out.println("\nVetor após substituição:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Elemento %d: %d%n", i + 1, vetor[i]);
        }

        scanner.close();
    }
}
