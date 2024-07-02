import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
  String name;
  int height;
  int weight;

  public Person(String name, int height, int weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public int compareTo(Person person) {
    if (this.height == person.height) {
      return person.weight - this.weight;
    }
    return this.height - person.height;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Person[] people = new Person[n];

    for (int i = 0; i < n; i++) {
      people[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(people);

    for (Person person : people) {
      System.out.printf("%s %d %d\n", person.name, person.height, person.weight);
    }
  }
}