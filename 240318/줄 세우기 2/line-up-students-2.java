import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student students[] = new Student[n];

        int num = 1;

        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(h, w, num++);
        }
        
        Arrays.sort(students);
        
        for(Student sd : students) {
            System.out.println(sd.h + " " + sd.w + " " + sd.num);
        }
    }

    static class Student implements Comparable<Student> {

        int h, w, num;

        public Student(int h, int w, int num) {
            this.h = h;
            this.w = w;
            this.num = num;
        }

        @Override
        public int compareTo(Student student) {
            if (h == student.h) {
                return student.w - w;
            }
            return h - student.h;
        }
    }
}