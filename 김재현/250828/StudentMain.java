import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "kim", 20, "Computer Science"),
                new Student(2, "lee", 25, "Computer Science"),
                new Student(3, "park", 30, "Business Administration"),
                new Student(4, "hong", 35, "Psychology"),
                new Student(5, "seo", 40, "Psychology"),
                new Student(6, "gu", 27, "Biology"),
                new Student(7, "song", 37, "Mechanical Engineering"),
                new Student(8, "gong", 29, "Biology"),
        };

        List<Student> list = new ArrayList<>();
        Set<Student> set = new HashSet<>();
        Map<Integer, Student> map = new HashMap<>();
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            list.add(student);
            set.add(student);
            map.put(student.getId(), student);
        }

        System.out.println("==List==");
        // 나이가 25 ~ 35살인 학생 출력
        for (Student student : list) {
            int age = student.getAge();
            if (age >= 25 && age <= 35) {
                System.out.println(student);
            }
        }

        System.out.println("==Set==");
        System.out.println("변경 전");
        for (Student student : set) {
            System.out.println(student);
        }
        // id 빼고 변경
        boolean add = set.add(new Student(3, "kim", 80, "Biology"));
        System.out.println("변경 여부: " + add);
        for (Student student : set) {
            System.out.println(student);
        }

        System.out.println("==Map==");
        int input = 4;
        System.out.println(map.get(input));

        System.out.println("==응용==");
        Map<String, List<Student>> map2 = new HashMap<>();
        for (Student student : students) {
            List<Student> temp = map2.getOrDefault(student.getMajor(), new ArrayList<>());
            temp.add(student);
            map2.put(student.getMajor(), temp);
        }
        for (String s : map2.keySet()) {
            System.out.print(s+": ");
            System.out.println(map2.get(s));
        }
    }
}
