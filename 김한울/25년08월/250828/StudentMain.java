package day09;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Student kim =new Student("1","kim",1,"컴퓨터공학과");
        Student lee =new Student("2","lee",3,"지리학과");
        Student park =new Student("3","park",2,"컴퓨터공학과");
        Student choi =new Student("4","choi",3,"지리학과");
        Student jung =new Student("5","jung",1,"경영학과");


        List<Student> studentList = new ArrayList<>();
        Set<Student> studentSet = new HashSet<>();
        Map<String, Student> studentMap = new HashMap<>();


        studentList.add(kim);
        studentList.add(lee);
        studentList.add(park);
        studentList.add(choi);
        studentList.add(jung);

        studentSet.add(kim);
        studentSet.add(lee);
        studentSet.add(park);
        studentSet.add(choi);
        studentSet.add(jung);

        studentMap.put(kim.getStudentId(), kim);
        studentMap.put(lee.getStudentId(), lee);
        studentMap.put(park.getStudentId(), park);
        studentMap.put(choi.getStudentId(), choi);
        studentMap.put(jung.getStudentId(), jung);


        int grade = 2;
        //이름과 전공 출력하기.
        List<Student> gradeList = studentList.stream()
                .filter(student -> student.getGrade() == grade)
                .toList();

        List<Student> testList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGrade() > grade) testList.add(student);
        }
        System.out.println("stream 이용");
        System.out.println(gradeList);

        System.out.println("iter 이용");
        System.out.println(testList);

        //학번이 동일한 학생 담아보기
        Student newStu = new Student("01", "new", 2, "지리학과");
        System.out.println("========넣기 전");
        System.out.println(studentSet);
        studentSet.add(newStu);
        System.out.println("========넣은 후");
        System.out.println(studentSet);

        Scanner sc = new Scanner(System.in);
        System.out.print("학번을 입력해주세요 : ");
        String stuId = sc.next();


        Student findingStudent = studentMap.get(stuId);
        if (findingStudent != null) System.out.println(findingStudent);
        else System.out.println("조건에 맞는 학생이 없습니다.");

        //응용
        System.out.println("응용==================");
        Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getMajor));

        //이 부분 하드코딩 하지말것
/*        System.out.println(collect.get("컴퓨터공학과"));
        System.out.println(collect.get("지리학과"));
        System.out.println(collect.get("경영학과"));*/

        for (String key : collect.keySet()) {
            System.out.println(collect.get(key));
        }


    }
}


/**
 * 컴퓨터공학과 : kim, lee
 * 경영학과 : park, choi
 * 지리학과 : jung
 */