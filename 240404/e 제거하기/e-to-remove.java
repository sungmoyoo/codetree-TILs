import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'e') {
            s = s.substring(0,i)+s.substring(i+1);
            break;
        }
    }        
    System.out.println(s);

    sc.close();
    }
}