package Day_0822;

public class Student {
    String name;
    int Score;
    static int totalScore=0;
    static int totalStudents=0;
    public Student(String name, int Score) {
        this.name = name;
        this.Score = Score;
        totalScore+=Score;
        totalStudents+=1;

    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + Score);
    }
    public static void displayStatistics() {
        System.out.println("Total Scores: " + totalScore);
        System.out.println("Total Students: " + totalStudents);
    }
}
