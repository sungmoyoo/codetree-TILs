import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int idx = 0;

        int[] A = new int[n1];
        int[] B = new int[n2];

        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        for (int value : A) {
            if (value == B[idx]) {
                idx++;
                if (idx == n2) {
                    System.out.println("Yes");
                    break;
                }
            } else {
                idx = 0;
            }
        }

        if (idx != n2) {
            System.out.println("No");
        }           
 
        
        
        sc.close();
    }
}