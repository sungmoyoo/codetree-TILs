import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] arr = s.split("-");

        System.out.println(arr[2] + "." + arr[0] + "." + arr[1]);

        // sc.useDelimiter("-");
        // int month = sc.nextInt();
        // int day = sc.nextInt();
        // int year = sc.nextInt();

        // System.out.println(year + "." + month + "." + day);

    }
}