import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.next());

        s.append(s.charAt(0)).deleteCharAt(0);

        System.out.println(s);

        sc.close();
    }
}