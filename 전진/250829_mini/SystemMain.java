package Mini_Project;

import java.util.Scanner;

public class SystemMain {
    public static void main(String[] args) {
        OrderSystem o = new OrderSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n시스템에 접속하셨습니다. 무엇을 하고 싶으신가요?");
            System.out.println("1. 메뉴 주문\t2. 주문한 메뉴 확인\t3. 시스템 종료");
            System.out.print("입력 : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    o.Start();
                    break;
                case "2":
                    o.Check();
                    break;
                case "3":
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바르지 않은 입력입니다. 숫자를 입력해주세요.");
                    break;
            }
        }
    }
}
