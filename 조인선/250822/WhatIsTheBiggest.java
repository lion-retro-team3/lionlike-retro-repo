package Hw1;
import java.util.Scanner;
public class WhatIsTheBiggest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력값 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
// 세 수가 서로 같은지 유효성 검사 후 비교 및 출력
        if(a == b || a == c || b == c){
            System.out.println("세 수는 전부 다른 정수여야 합니다.");
        }
        else if (a > b && a > c) {
            System.out.println("가장 큰 수는 " + a + "입니다.");
        } else if (b > a && b > c) {
            System.out.println("가장 큰 수는 " + b + "입니다.");
        } else  {
            System.out.println("가장 큰 수는 " + c + "입니다.");
        }
    }
}
