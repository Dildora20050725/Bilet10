import java.util.Scanner;

public class Top4 {
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sonni kiriting:");
        int num = scanner.nextInt();

        System.out.println("Raqamlar yig'indisi: " + digitSum(num));
    }

}
