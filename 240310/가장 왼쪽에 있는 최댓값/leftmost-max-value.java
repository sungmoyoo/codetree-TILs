import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int N = sc.nextInt();
        int[] arr = new int[N];
        int idx = N;
        

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        while (idx != 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                if (arr[i] > max && i < idx) {
                    max = arr[i];
                }    
            }
            for (int i = 0; i < idx; i++) {
                if (arr[i] == max) {
                    idx = i;
                    System.out.print(i+1 + " ");  
                    break; 
                }
            }
        
        }

        sc.close();
    }
}