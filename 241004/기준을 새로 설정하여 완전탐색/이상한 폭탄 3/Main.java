import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static int MAX_N = 100;
  public static int[] bombs = new int[MAX_N];
  public static boolean[] isExploded = new boolean[MAX_N];

  public static Map<Integer, Integer> countMap = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < N; i++) {
      bombs[i] = sc.nextInt();
    }

    // 모든 폭탄에 대해 완전탐색
    for (int i = 0; i < N; i++) {
      // 각 폭탄에 대하여 K범위 검사
      for (int j = i + 1; j <= i + K && j < N; j++) {
        // 같은 정수의 폭탄이 범위내에 존재하면 i번 폭탄과 j번 폭탄을 계산
        if (bombs[i] == bombs[j]) {

          // 이미 터진 폭탄인지 검사
          if (!isExploded[i]) {
            countMap.put(bombs[i], countMap.getOrDefault(bombs[i], 0) + 1);
            isExploded[i] = true;
          }
          if (!isExploded[j]) {
            countMap.put(bombs[j], countMap.getOrDefault(bombs[j], 0) + 1);
            isExploded[j] = true;
          }
        }
      }
    }

    int maxCount = 0;
    int maxNo = 0;
    // 가장 많이 터진 폭탄 계산
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        maxNo = entry.getKey(); // 정답 출력을 위해 최다 폭발 폭탄 key 갱신
      } else if (entry.getValue() == maxCount) {
        maxNo = Math.max(maxNo, entry.getKey());
      }
    }

    // 출력
    if (maxCount == 0) {
      System.out.println(0);
    } else {
      System.out.println(maxNo);
    }

    sc.close();
  }
}