import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num > 500) {
                if (num < min) {
                    min = num;
                }
            } else {
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.printf("%d %d", max, min);

        sc.close();
    }
}