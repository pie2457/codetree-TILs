import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Student students[] = new Student[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            students[i] = new Student(name, a, b, c);
        }

        Arrays.sort(students);

        for(Student stu : students) {
            System.out.println(stu.name + " " + stu.a + " " + stu.b + " " + stu.c);
        }
    }
    
    static class Student implements Comparable<Student> {

        String name;
        int a, b, c;

        public Student(String name, int a, int b, int c) {
            this.name = name;
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Student student) {
            return (this.a + this.b + this.c) - (student.a + student.b + student.c);
        }
    }
}