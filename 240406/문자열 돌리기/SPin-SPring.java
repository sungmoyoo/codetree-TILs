import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.next());
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            s.insert(0,s.charAt(s.length()-1)).deleteCharAt(s.length()-1);
            System.out.println(s);
        }
        sc.close();
    }
}