import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int no = sc.nextInt();
            if (no == 1) {
                s = s.substring(1) + s.substring(0,1);
                System.out.println(s);
            } else if (no == 2) {
                s = s.substring(s.length()-1) + s.substring(0, s.length()-1);
                System.out.println(s);
            } else if (no == 3) {
                char[] arr = s.toCharArray();
                String result = "";
                for (int j = arr.length-1; j >= 0; j--) {
                    result += arr[j];
                }
                s = result;
                System.out.println(s);
            }
        }

        sc.close();
    }
}