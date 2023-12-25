import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String[] arr = s.split("\\.");

        System.out.println(arr[1] + "-" + arr[2] + "-" + arr[0]);

        sc.close();
    }
}