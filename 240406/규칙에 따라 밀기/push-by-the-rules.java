import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.nextLine());
        
        String order = sc.nextLine();

        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) == 'L') {
                s.append(s.charAt(0)).deleteCharAt(0);
            } else if (order.charAt(i) == 'R') {
                s.insert(0, s.charAt(s.length()-1)).deleteCharAt(s.length()-1);
            }
        }
        System.out.println(s);
        sc.close();
    }
}