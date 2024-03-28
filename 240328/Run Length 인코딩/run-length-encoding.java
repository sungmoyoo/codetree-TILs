import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < A.length()-1; i++) {
            if (i == 0) {
                list.add(String.valueOf(A.charAt(i)));
            }

            if (A.charAt(i) == A.charAt(i+1)) {
                count++;
                if (i+1 == A.length()-1) {
                    list.add(String.valueOf(++count));
                    count = 0;
                }
            } else {
                list.add(String.valueOf(++count));
                list.add(String.valueOf(A.charAt(i+1)));
                count = 0;
            }
        }
        String result = "";
        for (String c : list) {
            result += c;
        }
        System.out.println(result.length());
        System.out.println(result);

        sc.close();
    }
}