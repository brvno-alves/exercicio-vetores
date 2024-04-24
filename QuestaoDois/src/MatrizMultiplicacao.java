import java.util.Scanner;

/**
 * Desenvolva um programa que leia 5 elementos de uma matriz A. Construir uma
 * matriz B de mesma dimensão com os elementos da matriz A multiplicados por 3 e
 * mostre a matriz B.
 */

public class MatrizMultiplicacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matrizA = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizB = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizB[i][j] = matrizA[i][j] * 3;
            }
        }

        System.out.println("\nA matriz B (A multiplicada por 3) é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
