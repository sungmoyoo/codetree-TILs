import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int cnt = 0;
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = sc.nextInt();
            if (i % 2 == 0) {
                sum1 += arr[i-1];
            }
            if (i % 3 == 0 && i != 0) {
                sum2 += arr[i-1];
                cnt++;
            }
        }

        System.out.print(sum1 + " ");
        System.out.print((double) sum2 / cnt);
    }
}