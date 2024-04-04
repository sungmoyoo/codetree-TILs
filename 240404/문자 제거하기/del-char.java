import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        while (s.length() > 1) {
            int idx = sc.nextInt();

            if (s.length() <= idx) {
                s = s.substring(0 , s.length()-1);
            } else {
                s = s.substring(0,idx) + s.substring(idx+1);
            }
            System.out.println(s);
        }

        sc.close();
    }
}