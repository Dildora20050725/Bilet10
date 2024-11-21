import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N ni kiriting:");
        int N = scanner.nextInt();

        int[][] matrix = new int[N][N];
        int value = 1;

        int top = 0, left = 0, bottom = N - 1, right = N - 1;

        while (value <= N * N) {
            for (int i = top; i <= bottom; i++) matrix[i][left] = value++;
            left++;
            for (int i = left; i <= right; i++) matrix[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) matrix[top][i] = value++;
            top++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

