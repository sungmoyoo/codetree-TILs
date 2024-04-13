import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String A = st.nextToken();
        int count = 0;
        for (int i = 0 ; i < n; i++) {
            String s = br.readLine();

            if (s.equals(A)) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
    }
}