import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student students[] = new Student[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for(Student stu : students) {
            System.out.println(stu.name + " " + stu.kor + " " + stu.eng + " " + stu.math);
        }
    }

    static class Student implements Comparable<Student> {

        String name;
        int kor, eng, math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Student student) {
            if (this.kor == student.kor) {
                if (this.eng == student.eng) {
                    return student.math - this.math;
                } else {
                    return student.eng - this.eng;
                }
            }
            return student.kor - this.kor;
        }
    }
}