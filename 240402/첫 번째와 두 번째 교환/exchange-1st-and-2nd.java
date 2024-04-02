import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        char idx1 = arr[0];
        char idx2 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == idx1) {
                arr[i] = idx2;
            } else if (arr[i] == idx2) {
                arr[i] = idx1;
            }
        }

        System.out.println(String.valueOf(arr));
        
        sc.close();
    }
}