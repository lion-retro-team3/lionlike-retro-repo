package Day_0827.Order_System;

import Day_0827.Order_System.Kitchen;

public class OrderTest {
    public static void main(String[] args) {
        Orderable o1 = new Pizza(26000,"고르곤졸라");
        Orderable o2 = new Ramen(10000,"돈코츠");

        o1.order(); // 고르곤졸라 피자를 주문했습니다.
        o2.order(); // 돈코츠 라면을 주문했습니다.

        Orderable[] orders = {o1, o2};
        System.out.println("\n=====주문 상태 확인하기=======");
        for (Orderable order : orders) {
            order.getStatus();
        }

        Kitchen kitchen = new Kitchen(); // 주방 객체 생성

        // 주방에서 상태 변경
        kitchen.cook(o1);
        kitchen.complete(o1);
        kitchen.cook(o2);

        System.out.println("\n=====주문 상태 확인하기=======");
        for (Orderable order : orders) {
            order.getStatus();
        }
    }
}
