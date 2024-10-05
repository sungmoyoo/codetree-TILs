import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static int MAX_N = 1000;
  public static int MAX_H = 100;
  public static int[] hill = new int[MAX_N];

  public static Map<Integer, Integer> countMap = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      hill[i] = sc.nextInt();
    }

    int answer = Integer.MAX_VALUE;

    // 최소 높이 완전탐색
    for (int i = 0; i <= MAX_H - 17; i++) {
      int cost = 0;

      // 언덕 완전탐색
      for (int j = 0; j < N; j++) {

        // 최소높이보다 작거나 최대높이보다 크면 i ~ i+17 범위 이내로 조정하고 비용 계산
        if (hill[j] < i) {
          int x = Math.abs(i-hill[j]);
          cost += x * x;
        } else if(hill[j] > i + 17) {
          int x = Math.abs(i+17-hill[j]);
          cost += x * x;
        }

      }
      //결과 출력
      answer = Math.min(answer, cost);
    }
    System.out.println(answer);
  }
}