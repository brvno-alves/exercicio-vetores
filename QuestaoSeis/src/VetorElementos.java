import java.util.Scanner;

public class VetorElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[6];
        int negativos = 0;

        for (int i = 0; i < 6; i++) {
            System.out.printf("Digite o %dº elemento: ", i + 1);
            vetor[i] = scanner.nextInt();

            if (vetor[i] < 0) {
                negativos++;
            }
        }

        System.out.println("\nElementos do vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Elemento %d: %d%n", i + 1, vetor[i]);
        }

        System.out.printf("\nQuantidade de elementos negativos: %d%n", negativos);

        scanner.close();
    }
}
