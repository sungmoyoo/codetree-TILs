import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 1; i < arr.length-1; i++) {
            arr[i+1] = arr[i] + arr[i-1];
            if (arr[i+1] >= 10) {
                arr[i+1] -= 10;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}