import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder A = new StringBuilder(sc.nextLine());
        String B = sc.nextLine();

        int n = 0;
        boolean exist = false;

        for (int i = 0; i < A.length(); i++) {
            if (B.equals(A.toString())) {
                exist = true;
                break;
            } 
            A.append(A.charAt(0)).deleteCharAt(0);
            n++;
        }
        if (exist == true) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
    
}