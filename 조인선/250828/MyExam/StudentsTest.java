package day09.MyExam;
import java.util.*;

public class StudentsTest {
    public static void main(String[] args) {

        Student kimp = new Student("112", "김경찰", 1, "경찰행정학과");
        Student kims = new Student("119", "김소방", 1, "소방행정학과");
        Student kimj = new Student("111", "김정보", 1, "정보보안학과");
        Student kimb = new Student("211", "김보안", 4, "정보보안학과");
        Student leej = new Student("311", "이정보", 3, "정보보안학과");
        Student lees = new Student("119", "이소방", 2, "소방행정학과");
        //List
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(kimp);
        studentsList.add(kims);
        studentsList.add(kimj);
        studentsList.add(kimb);
        studentsList.add(leej);
        studentsList.add(lees);

        System.out.println("\n학년이 2인 학생:");
        for (Student s : studentsList) {
            if (s.getGrade() == 2) {
                System.out.println("  " + s);

                System.out.println();


                //Set
                Set<Student> studentsSet = new HashSet<>();
                studentsSet.add(kimp);
                studentsSet.add(kims);
                studentsSet.add(kimj);
                studentsSet.add(kimb);
                studentsSet.add(leej);
                studentsSet.add(lees);

                System.out.println("=====학생목록=====");
                for (Student ss : studentsSet) {
                    System.out.println((" ") + ss);
                }

                //Map
                Map<String, Student> studentMap = new HashMap<>();
                studentMap.put(kimp.getStudentId(), kimp);
                studentMap.put(kims.getStudentId(), kims);
                studentMap.put(kimj.getStudentId(), kimj);
                studentMap.put(kimb.getStudentId(), kimb);
                studentMap.put(leej.getStudentId(), leej);

                Scanner sc = new Scanner(System.in);

                System.out.println("학번을 입력하시오.");
                String i = sc.nextLine();
                Student found = studentMap.get(i);
                if (found != null) {
                    System.out.println(found);
                } else {
                    System.out.println("해당 학번은 없습니다.");
                }

//응용
                Map<String, List<Student>> theMajor = new HashMap<>();
               for (String major : theMajor.keySet()) {
                        System.out.println(major + " : " + theMajor.get(major));
                    }

                }
            }
        }
    }
