import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int max = -1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int currNum = arr[i];
            if (max < currNum) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[j] == currNum) {
                        count++;
                    }
                }
                if (count == 1) {
                    max = currNum;
                }
            }
        }

        System.out.print(max);


        sc.close();

    }
}