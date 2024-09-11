  import java.util.Scanner;

  public class Main {
    // 각 경기별 순위를 저장할 배열
    public static int[][] rank = new int[10][20];

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int K = sc.nextInt();
      int N = sc.nextInt();

      // 초기값 입력
      for (int i = 0; i < K; i++) {
        for (int j = 0; j < N; j++) {
          // 경기별 개발자의 순위를 저장하기 위해 입력되는 개발자 번호를 인덱스 번호로 사용.
          int developer = sc.nextInt()-1;
          rank[i][developer] = j; // 순위는 먼저 입력된 순서대로.
        }
      }

      int count = 0;
      // a와 b 전체탐색
      for (int a = 0; a < N; a++) {
        for (int b = 0; b < N; b++) {

          // 선택된 a와 b에 대하여 3번씩 반복해야 함.
          boolean isHigher = true;
          for (int k = 0; k < K; k++) {
            // 만약 선택된 번호가 같은 번호이거나 순위가 더 낮다면 반복 종료
            if (a == b || rank[k][a] > rank[k][b]) {
              isHigher = false;
              break;
            }

          }
          // 반복이 끝난 후 a가 항상 b보다 높은 순위라면 카운트
          if (isHigher) {
            count++;
          }
        }
      }

      // 결과 출력
      System.out.println(count);
    }
  }