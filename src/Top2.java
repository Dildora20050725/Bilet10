import java.util.Scanner;

public class Top2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sonni kiriting:");
        int num = scanner.nextInt();

        boolean isSquare = false;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isSquare = true;
                break;
            }
        }

        System.out.println(isSquare);
    }
}
