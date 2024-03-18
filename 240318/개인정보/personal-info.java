import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student students[] = new Student[5];

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble(); 

            students[i] = new Student(name, h, w);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for(Student sd : students) {
            System.out.println(sd.name + " " + sd.h + " " + sd.w);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return b.h - a.h;
            }
        });

        System.out.println();
        System.out.println("height");
        for(Student sd : students) {
            System.out.println(sd.name + " " + sd.h + " " + sd.w);
        }
    }

    static class Student {

        String name;
        int h;
        double w;

        public Student(String name, int h, double w) {
            this.name = name;
            this.h = h;
            this.w = w;
        }
    }
}