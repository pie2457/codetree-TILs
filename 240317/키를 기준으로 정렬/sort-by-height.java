import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Person persons[] = new Person[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            persons[i] = new Person(name, height, weight);
        }

        Arrays.sort(persons);

        for(Person person : persons) {
            System.out.println(person.name + " " + person.height + " " + person.weight);
        }
    }

    static class Person implements Comparable<Person> {

        String name;
        int height;
        int weight;

        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Person person) {
            return this.height - person.height;
        } 
    }
}