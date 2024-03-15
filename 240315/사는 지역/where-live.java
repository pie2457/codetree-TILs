import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person personList[] = new Person[n];

        char c = 'a';
        int cnt = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();

            personList[i] = new Person(name, address, region);

            if (name.charAt(0) > c) {
                c = name.charAt(0);
                cnt = i;
            }
        }

        System.out.println("name " + personList[cnt].name);
        System.out.println("addr " + personList[cnt].address);
        System.out.println("city " + personList[cnt].region);
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