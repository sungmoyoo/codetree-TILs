import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < q; i++) {
            int no = sc.nextInt();

            if (no == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a]);

            } else if (no == 2) {
                int a = sc.nextInt();
                int e = -1;
                for (int j = 1; j <= n; j++) {
                    if (arr[j] == a) {
                        e = j;
                        break;
                    }
                }
                if (e == -1) {
                    System.out.println(0);
                } else {
                    System.out.println(e);
                }
                

            } else if (no == 3) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int j = a; j <= b; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}