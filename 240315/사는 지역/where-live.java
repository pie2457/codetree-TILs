import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person personList[] = new Person[n];
        String names[] = new String[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();

            personList[i] = new Person(name, address, region);
            names[i] = name;
        }

        Arrays.sort(names);

        for(Person per : personList) {
            if (per.name.equals(names[n-1])) {
                System.out.println("name " + per.name);
                System.out.println("addr " + per.address);
                System.out.println("city " + per.region);
                break;
            }
        }
    }

    static class Person {
        String name;
        String address;
        String region;

        public Person(String name, String address, String region) {
            this.name = name;
            this.address = address;
            this.region = region;
        }
    }
}