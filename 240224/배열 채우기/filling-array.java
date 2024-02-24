import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cursor = 0;
        while (true) {
            int n = sc.nextInt();
            if (n != 0) {
                arr[cursor] = n;
                cursor++;
            } else {
                break;
            }
        }

        for (int i = cursor; i > 0; i--) {
            System.out.printf("%d ", arr[i-1]);
        }

        sc.close();
    }
}