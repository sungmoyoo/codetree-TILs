import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] strArr = s.split(":");

        int hour = Integer.parseInt(strArr[0]);

        System.out.println(++hour + ":" + strArr[1]);

        // sc.useDelimiter(":");
        // int hour = sc.nextInt();
        // int minute = sc.nextInt();

        // System.out.println(++hour + ":" + minute);
    }
}