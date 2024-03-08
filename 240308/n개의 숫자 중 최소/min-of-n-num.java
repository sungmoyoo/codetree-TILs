import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];
        int cnt = 0;
        int INT_MAX = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < INT_MAX) {
                INT_MAX = arr[i];
            }
            
        }
        
        for (int value : arr) {
            if (value == INT_MAX) {
                cnt++;
            }
        }

        System.out.printf("%d %d", INT_MAX, cnt);

        sc.close();

    }
}