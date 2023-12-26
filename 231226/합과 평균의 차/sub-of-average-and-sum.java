import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int average = sum/3;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(sum-average);
        
        sc.close();
    }
}