import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static int N = 15;
  public static ArrayList<Integer> list = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    // A <= B <= C <= D 조건을 충족하도록 오름차순 정렬
    Collections.sort(list);

    // 정답을 출력하면 반복문을 탈출하는 루프를 사용
    loop:
    // a, b, c, d 완전탐색
    // 원소 중복은 없으므로 이전 요소+1
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        for (int k = j+1; k < N; k++) {
          for (int l = k+1; l < N; l++) {
            int a = list.get(i);
            int b = list.get(j);
            int c = list.get(k);
            int d = list.get(l);

            // 조건 부합 여부 판단
            if(isContain(a, b, c, d)) {
              System.out.printf("%d %d %d %d\n",a, b, c, d);
              break loop;
            }
          }
        }
      }
    }
  }

  public static boolean isContain(int A, int B, int C, int D) {
    // 모든 조건 탐색
    if (list.contains(A+B) &&
        list.contains(B+C) &&
        list.contains(C+D) &&
        list.contains(D+A) &&
        list.contains(A+C) &&
        list.contains(B+D) &&
        list.contains(A+B+C) &&
        list.contains(A+B+D) &&
        list.contains(A+C+D) &&
        list.contains(B+C+D) &&
        list.contains(A+B+C+D)) {
      return true;
    } else {
      return false;
    }
  }
}
