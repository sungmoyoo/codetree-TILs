import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String residentNumber = sc.next();
        String[] arr = residentNumber.split("-");
        System.out.println(arr[0] + arr[1]);

        // sc.useDelimiter("-");
        // String f = sc.next();
        // String b = sc.next();

        // System.out.println(f + b);

        sc.close();
    }
}