import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < q; i++) {
            int no = sc.nextInt();

            if (no == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if (no == 2) {
                int a = sc.nextInt();
                for (int j = 1; j <= arr.length; j++) {
                    if (arr[j-1] == a) {
                        System.out.println(j);
                        break;
                    }
                }
            } else if (no == 3) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int j = a; j <= b; j++) {
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}