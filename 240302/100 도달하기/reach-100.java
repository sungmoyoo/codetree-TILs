import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        arr[0] = 1;
        arr[1] = n;
        int stop = 0;

        for (int i = 1; i < 100; i++) {
            arr[i+1] = arr[i] + arr[i-1];

            if (arr[i+1] >= 100) {
                stop = i+1;
                break;
            } 
        }
        for (int i = 0; i <= stop; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}