import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros primos no vetor:");
        for (int i = 0; i < n; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
