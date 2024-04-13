import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int i = 0;

        while (true) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            }

            if (i % 2 == 0) {
                list.add(s);
            }
            i++;
        }

        System.out.println(i);

        for (String value : list) {
            System.out.println(value);
        }
        sc.close();
    }
}