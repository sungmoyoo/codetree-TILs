import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Person {
  String name;
  String address;
  String region;

  public Person(String name, String address, String region) {
    this.name = name;
    this.address = address;
    this.region = region;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Person> people = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      people.add(getPerson(sc));
    }

    List<Person> sortedList = people.stream()
        .sorted(Comparator.comparing(person -> person.name))
        .toList();

    System.out.println("name " + sortedList.getLast().name);
    System.out.println("addr " + sortedList.getLast().address);
    System.out.println("city " + sortedList.getLast().region);
  }

  public static Person getPerson(Scanner sc) {
    return new Person(sc.next(), sc.next(), sc.next());
  }
}