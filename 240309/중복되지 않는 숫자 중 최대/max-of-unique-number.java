import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arrCount = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            arrCount[arr[i]]++;
        }

        for (int i = 1; i < arrCount.length; i++) {
            if (arrCount[i] < 2) {
                if (arrCount[i] > max) {
                    max = i;
                }
            }
        }
        if (max == 0) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }

        sc.close();

    }
}