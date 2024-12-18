public class Top5 {
    public static void main(String[] args) {
        int[][] array = {
                {2, -3, -5, 4, -7, 8, 9},
                {-1, 10, 11, -13, 14, -15, 16},
                {17, -19, 20, 21, -23, 24, -25},
                {26, 27, -29, 30, 31, -32, 33},
                {-34, 35, -36, 37, -38, 39, -40},
                {41, -42, 43, -44, 45, -46, 47},
                {-48, 49, -50, 51, -52, 53, -54}
        };

        int sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (array[i][j] < 0 && array[i][j] % 2 != 0) {
                    sum += Math.abs(array[i][j]);
                }
            }
        }

        System.out.println("Manfiy toq elementlar yig'indisi modulining qiymati: " + sum);
    }
}
