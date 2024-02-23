import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Stack<String> stack = new Stack<>();

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < 10; i++) {

      stack.push(st.nextToken());
    }

    while (!stack.isEmpty()) {
      bw.write(stack.pop());
    }
    bw.flush();
    bw.close();
    br.close();
  }
}