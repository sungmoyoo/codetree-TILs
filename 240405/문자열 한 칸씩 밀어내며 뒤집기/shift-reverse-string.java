import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        int q = Integer.parseInt(st.nextToken());

        for (int i = 0; i < q; i++) {
            int no = Integer.parseInt(br.readLine());

            if (no == 1) {
                s = s.substring(1) + s.substring(0,1);
                bw.write(s + "\n");
            } else if (no == 2) {
                s = s.substring(s.length()-1) + s.substring(0, s.length()-1);
                bw.write(s + "\n");
            } else if (no == 3) {
                char[] arr = s.toCharArray();
                String result = "";
                for (int j = arr.length-1; j >= 0; j--) {
                    result += arr[j];
                }
                s = result;
                bw.write(s + "\n");
            }
        }

        bw.close();
        br.close();
    }
}