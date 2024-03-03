import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[101];
        int[] countArr = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 1; i <= 100; i++) {
            
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr[i] = n / 10;
            countArr[arr[i]]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }

        sc.close();
    }
}