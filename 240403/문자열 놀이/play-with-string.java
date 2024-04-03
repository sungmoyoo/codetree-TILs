import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = Integer.parseInt(sc.next());

        for (int i = 0; i < q; i++) {
            int type = Integer.parseInt(sc.next());
            if (type == 1) {
                int idx1 = Integer.parseInt(sc.next())-1;
                int idx2 = Integer.parseInt(sc.next())-1;

                char[] arr = s.toCharArray();
                char temp = arr[idx1];
                arr[idx1] = arr[idx2];
                arr[idx2] = temp;

                s = String.valueOf(arr);
                System.out.println(s);

            } else if (type == 2) {
                char c1 = sc.next().charAt(0);
                char c2 = sc.next().charAt(0);

                char[] arr = s.toCharArray();

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == c1) {
                        arr[j] = c2;
                    }
                }
                s = String.valueOf(arr);
                System.out.println(s);
            }
        }

        sc.close();
    }
}