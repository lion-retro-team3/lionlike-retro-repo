package Hw1;
import java.util.Scanner;
public class IsItOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력받기
        int num = scanner.nextInt();
        // 짝수 판별 및 출력
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");

        // 홀수 판별 및 출력
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
