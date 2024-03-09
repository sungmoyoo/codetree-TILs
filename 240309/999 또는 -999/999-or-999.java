import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int INT_MIN = Integer.MAX_VALUE;
        int INT_MAX = Integer.MIN_VALUE;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }

            if (arr[i] > INT_MAX) {
                INT_MAX = arr[i];
            } 
            if (arr[i] < INT_MIN) {
                INT_MIN = arr[i];
            }
        }
        System.out.printf("%d %d", INT_MAX, INT_MIN);

        sc.close();
    }
}