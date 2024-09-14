import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 자리 수 가 정해져 있는 경우 직접 나누기로 자리수를 구하는 방법이 가장 편하지만
    // 해당 문제는 자리수가 한자리부터 5자리까지 변동되기 때문에 위 방법으로 구할 수 없다.

    // 먼저 떠오른 방법은 i를 타입변환을 통해 char[] 배열로 바꾸어 계산하는 방법인데 int -> String -> char[] 배열로 여러번 바꾸어야 하는 단점이 존재한다.
    // 따라서 10을 반복적으로 나누어가며 해당 자리수를 더해주는 방식을 사용하는 것이 더 효율적이라고 본다.
    // 재귀함수를 사용하면 위 작업을 보다 간단하게 함수식으로 작성할 수 있어 해당 방법을 사용함.

    int X = sc.nextInt();
    int Y = sc.nextInt();

    int result = 0;

    for (int i = X; i <= Y; i++) {
      result = Math.max(result, getDigit(i));
    }

    System.out.println(result);
  }

  // 자리 수들의 합을 구하는 재귀함수
  public static int getDigit(int n) {
    if (n < 10) {
      return n;
    } else {
      return getDigit(n / 10) + (n % 10);
    }
  }
}