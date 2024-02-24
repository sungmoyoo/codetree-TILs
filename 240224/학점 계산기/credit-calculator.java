import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Float> list = new ArrayList<>();
        float sum = 0;
        float avg = 0;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Float.parseFloat(st.nextToken()));
        }

        for (float value : list) {
            sum += value;
        }
        avg = sum / (float) list.size();
        bw.write(String.format("%.1f",avg) + "\n");

        if (avg > 4.0) {
            bw.write("Perfect\n");

        } else if (avg > 3.0) {
            bw.write("Good\n");

        } else {
            bw.write("Poor\n");
        }

        bw.close();
        br.close();
    }
}