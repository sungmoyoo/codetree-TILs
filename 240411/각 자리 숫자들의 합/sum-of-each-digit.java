import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = Integer.toString(n);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            String no = "";
            no += s.charAt(i);
            sum += Integer.parseInt(no);
        }

        System.out.println(sum);

        sc.close();
    }
}