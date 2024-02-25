import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr[i] = n;
            cnt++;
        }

        for (int value : arr) {
            sum += value;
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);

        sc.close();
    }
}