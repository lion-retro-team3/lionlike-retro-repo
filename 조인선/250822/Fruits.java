package Hw1;

import java.util.Scanner;
public class Fruits {
    public static void main(String[] args) {
        // 과일 목록 배열
        String[] ourfruits = {"사과", "바나나", "딸기", "포도"};
        // 입력값 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("찾은 과일은 무엇입니까?");
        String inputFruit = scanner.nextLine().trim();
// 과일 목록을 입력값과 비교 후 종료
        for (String ourfruit : ourfruits) {
            if (ourfruit.equals(inputFruit)) {
                System.out.println("네, " + ourfruit + "를 드리겠습니다.");
                return;
            }
        }

                    System.out.println("죄송합니다. " + inputFruit + " 은/는 없습니다.");
    }
}

