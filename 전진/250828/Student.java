package Day_0828;

import Day_0822.DiceUser;

public class Student
{
    private String studentId;  // 학번
    private String name;       // 이름
    private int grade;         // 학년
    private String major;      // 전공

    // 모든 필드를 입력받는 생성자 생성

    public Student(String studentId, String name, int grade, String major) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    // getter, setter 생성

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // toString 생성
    public String toString(){
        return "\n학번 : "+studentId + "\n이름 : " + name + "\n학년 : " + grade + "\n전공 : " + major;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;

        return studentId.equals(other.studentId);
        /*
        /return grade == other.grade &&
                studentId.equals(other.studentId) &&
                name.equals(other.name) &&
                major.equals(other.major);
*/
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(studentId);
        //return java.util.Objects.hash(studentId, name, major, grade);
    }

}
