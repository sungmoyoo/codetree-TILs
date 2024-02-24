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
        ArrayList<Double> list = new ArrayList<>();
        double sum = 0;
        double avg = 0;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Double.parseDouble(st.nextToken()));
        }

        for (double value : list) {
            sum += value;
        }
        avg = sum / (double) list.size();
        bw.write(String.format("%.1f", avg));
        bw.write("\n");

        if (avg >= 4.0) {
            bw.write("Perfect\n");

        } else if (avg >= 3.0) {
            bw.write("Good\n");

        } else {
            bw.write("Poor\n");
        }

        bw.close();
        br.close();
    }
}