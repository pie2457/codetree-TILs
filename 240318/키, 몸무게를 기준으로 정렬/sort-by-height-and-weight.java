import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student students[] = new Student[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(name, h, w);
        }

        Arrays.sort(students);

        for(Student sd : students) {
            System.out.println(sd.name + " " + sd.h + " " + sd.w);
        }
    }

    static class Student implements Comparable<Student> {

        String name;
        int h, w;

        public Student(String name, int h, int w) {
            this.name = name;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Student student) {
            if (this.h == student.h) {
                return student.w - this.w;
            }
            return this.h - student.h;
        }
    }
}