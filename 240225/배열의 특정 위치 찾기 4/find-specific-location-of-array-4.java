import java.util.Scanner;

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
            } else if (n % 2 == 0) {
                arr[i] = n;
                cnt++;
                sum += n;
            }
        }

        System.out.printf("%d %d", cnt, sum);

        sc.close();
    }
}