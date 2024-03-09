import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arrCount = new int[N+1];
        int INT_MAX = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            arrCount[sc.nextInt()]++;
        }

        for (int i = 1; i < arrCount.length; i++) {
            if (arrCount[i] == 1) {
                if (i > INT_MAX) {
                    INT_MAX = i;
                }
            }
        }
        if (INT_MAX < 0) {
            System.out.println(-1);
        } else {
            System.out.println(INT_MAX);
        }

        sc.close();

    }
}