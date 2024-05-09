import java.util.Scanner;

public class ProdutoEscalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] u = new int[n];
        int[] v = new int[n];

        System.out.println("Digite os elementos do vetor u:");
        for (int i = 0; i < n; i++) {
            System.out.printf("u[%d]: ", i);
            u[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor v:");
        for (int i = 0; i < n; i++) {
            System.out.printf("v[%d]: ", i);
            v[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += u[i] * v[i];
        }

        System.out.println("\nVetor u:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", u[i]);
        }

        System.out.println("\nVetor v:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", v[i]);
        }

        System.out.printf("\nProduto escalar (u · v): %d%n", produtoEscalar);

        scanner.close();
    }
}
