import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int cnt = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
    
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }
            list.add(n);        
            cnt++;
        }

        for (int i = cnt-1; i >= cnt-3; i--) {
            sum += list.get(i);
        }

        bw.write(sum+"\n");

        br.close();
        bw.close();
    }
}