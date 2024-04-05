import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder s = new StringBuilder(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        for (int i = 0; i < q; i++) {
            int no = Integer.parseInt(br.readLine());

            if (no == 1) {
                s.append(s.charAt(0)).deleteCharAt(0);
                bw.write(s + "\n");
            } else if (no == 2) {
                s.insert(0,s.charAt(s.length()-1)).deleteCharAt(s.length()-1);
                bw.write(s + "\n");
            } else if (no == 3) {
                s.reverse();
                bw.write(s + "\n");
            }
        }

        bw.close();
        br.close();
    }
}