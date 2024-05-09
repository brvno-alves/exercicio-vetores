import java.util.Scanner;

public class SubtracaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os 5 elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("\nVetor C (A - B):");
        for (int i = 0; i < 5; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }

        scanner.close();
    }
}
