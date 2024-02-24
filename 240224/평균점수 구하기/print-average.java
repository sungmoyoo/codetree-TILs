import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        double[] arr = new double[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
        }

        for (double score : arr) {
            sum += score;
        }
        System.out.printf("%.1f", sum / (double) arr.length);

        sc.close();
    }
}