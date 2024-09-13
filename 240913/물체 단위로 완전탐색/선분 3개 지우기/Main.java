import java.util.Scanner;

public class Main {
  public static int[] start = new int[100];
  public static int[] end = new int[100];
  public static int n;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      start[i] = sc.nextInt();
      end[i] = sc.nextInt();
    }

    int count = 0;
    // 세 선분 선택
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {

          // 나머지 선분을 그려 겹치는지 확인
          int[] arr = new int[100];
          for (int l = 0; l < n; l++) {
            if (l == i || l == j || l == k) {
              continue;
            }
            drawLine(l, arr);
          }
          // 겹치지 않았다면 카운트
          if (!checkOverlap(arr)) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
  
  // 선분에 가중치를 부여하는 메서드
  public static void drawLine(int l, int[] arr) {
    for (int i = start[l]; i <= end[l]; i++) {
      arr[i]++;
    }
  }

  // 겹치는지 확인하는 메서드
  public static boolean checkOverlap(int[] arr) {
    for (int p : arr) {
      if (p > 1) {
        return true;
      }
    }

    return false;
  }
}