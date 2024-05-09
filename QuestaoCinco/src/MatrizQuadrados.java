import java.util.Scanner;

public class MatrizQuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println("\nVetor B (quadrados dos elementos de A):");
        for (int i = 0; i < 5; i++) {
            System.out.println("B[" + i + "]: " + B[i]);
        }

        scanner.close();
    }
}
