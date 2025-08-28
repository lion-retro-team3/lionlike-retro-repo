package Day_0828;

import java.util.*;
/*
List

Student 객체를 5개 생성하여 학생 5명을 만들기
List<Student>에 학생을 담기
2학년인 학생의 이름과 전공을 출력하기 (Get()메서드 활용);

Set

학번이 동일한 객체에 다른 학생을 담아보고 중복이 어떻게 처리되는지 확인하기.

Map

key값은 studentId, value값은 Student인 Map을 만들어 학생 데이터를 담아보기
사용자에게 학번을 입력받아, 그 학생의 데이터를 출력하기.

응용

모든 학생을 List에 담은 뒤, 전공별로 학생들을 Map<String, List<Student>>에 담아 이름을 출력하기.
* */

public class Student_Manage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("====학생 5인 추가 진행====");
        Student Kim=new Student("2025082801","김아무개",2,"컴퓨터공학부");
        Student Park=new Student("2025082802","박아무개",3,"경영학부");
        Student Choi=new Student("2025082803","최아무개",4,"건축공학부");
        Student Han=new Student("2025082804","한아무개",1,"경영학부");
        Student Yu=new Student("2025082805","유아무개",2,"컴퓨터공학부");

        System.out.println("\n====리스트 추가 진행====");
        List<Student> StudentList = Arrays.asList(Kim, Park, Choi, Han, Yu);

        System.out.println("2학년인 학생 정보 출력하기");

        for(Student s: StudentList){
            if(s.getGrade()==2){
                System.out.println(s.toString());
            }
        }

        System.out.println("\n====SET 추가 진행====");
        Set<Student> StudentSet = new HashSet<>(Arrays.asList(Kim, Park, Han, Yu, Choi));

        System.out.println("\n====학번이 같은 학생 추가 전 SET 출력====");
        for(Student s: StudentSet){
            System.out.println(s.toString());
        }

        System.out.println("\n====학번이 같은 학생 추가 후 SET 출력====");
        Student Lee=new Student("2025082802","이아무개",4,"영어영문학부");
        StudentSet.add(Lee);
        for(Student s: StudentSet){
            System.out.println(s.toString());
        }

        System.out.println("\n====Map 추가 진행====");
        Map<String,Student> StudentMap=new HashMap<>();
        StudentMap.put(Kim.getStudentId(), Kim);
        StudentMap.put(Park.getStudentId(), Park);
        StudentMap.put(Choi.getStudentId(), Choi);
        StudentMap.put(Han.getStudentId(), Han);
        StudentMap.put(Yu.getStudentId(), Yu);

        System.out.println("\n====학번 입력하기====");
        String keyword=sc.nextLine();
        for(String studentid: StudentMap.keySet()){
            if(studentid.equals(keyword)){
                System.out.println("데이터 출력하기");
                System.out.println(StudentMap.get(studentid).toString());
            }
        }

        System.out.println("\n====응용====");
        Map<String,List<String>> MajorMap=new HashMap<>();
        for(Student s: StudentList){
            if (!MajorMap.containsKey(s.getMajor())){
                MajorMap.put(s.getMajor(),new ArrayList<>());
            }
            MajorMap.get(s.getMajor()).add(s.getName());
        }
        for(String Major: MajorMap.keySet()){
            System.out.println(Major);
            System.out.println(MajorMap.get(Major));
            System.out.println();
        }

    }
}
