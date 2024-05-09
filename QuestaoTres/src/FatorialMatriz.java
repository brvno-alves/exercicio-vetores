import java.util.Scanner;

public class FatorialMatriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linhas = 5;
        int colunas = 1;

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];

        System.out.println("Digite 5 elementos inteiros para a matriz A:");
        for (int i = 0; i < linhas; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            matrizA[i][0] = scanner.nextInt();
        }

        for (int i = 0; i < linhas; i++) {
            matrizB[i][0] = calcularFatorial(matrizA[i][0]);
        }

        System.out.println("\nA matriz B (fatoriais dos elementos de A) é:");
        for (int i = 0; i < linhas; i++) {
            System.out.println(matrizB[i][0]);
        }

        scanner.close();
    }

    // Método que calcula o fatorial de um número inteiro.

    public static int calcularFatorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
