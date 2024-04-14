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
            A.insert(0, A.charAt(A.length()-1)).deleteCharAt(A.length()-1);
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