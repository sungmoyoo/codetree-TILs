import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < n; i++) {
            result += br.readLine();
        }

        bw.write(result + "\n");

        bw.close();
        br.close();
    }
}