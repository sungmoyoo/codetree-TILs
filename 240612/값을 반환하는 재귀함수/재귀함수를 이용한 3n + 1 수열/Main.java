import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(count(n));

    sc.close();
  }

  public static int count(int n) {
    if (n == 1)
      return 0;

    if (n % 2 == 0) {
      return count(n / 2) + 1;
    } else {
      return count(n * 3 + 1) + 1;
    }
  }
}