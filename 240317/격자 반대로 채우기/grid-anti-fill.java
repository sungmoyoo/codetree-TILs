import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int num = 1;
        boolean direction = true;

        for (int i = n-1; i >= 0; i--) {
            if (direction == true) {
                for (int j = n-1; j >= 0; j--) {
                    arr[j][i] = num++;
                    direction = false;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = num++;
                    direction = true;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}