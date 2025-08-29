package Mini_Project;

import Mini_Project.Restaurant.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderSystem {
    private OrderManager orderManager = new OrderManager();

    public void Start(){
        System.out.println("\n주문 시스템에 접속하셨습니다. 주문할 메뉴를 골라주세요.");
        System.out.println("1. 한식\t2. 일식\t3. 양식\t4. 중식\t5. 뒤로 가기");
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        AbstractRestaurant restaurant = null;
        switch (choice) {
            case "1":
                restaurant = new Korean_Restaurant(sc,orderManager);
                break;

            case "2":
                restaurant = new Japanese_Restaurant(sc,orderManager);
                break;

            case "3":
                restaurant = new Western_Restaurant(sc,orderManager);
                break;

            case "4":
                restaurant = new Chinese_Restaurant(sc,orderManager);
                break;

            case "5":
                System.out.println("메인 메뉴로 돌아갑니다. ");
                return;
            default:
                System.out.println("올바르지 않은 입력입니다. 숫자를 입력해주세요.");
                break;
        }
        restaurant.chooseRestaurant();

    }
    public void Check(){
        orderManager.printAllOrders();
    }

}
