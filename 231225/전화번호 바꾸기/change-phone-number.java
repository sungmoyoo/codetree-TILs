import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");
        String a = sc.next();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + "-" + c + "-" + b);
        sc.close();
    }
}