package Day_0827.Order_System;

class Kitchen {
    public void cook(Orderable order) {
        System.out.println("\n===주문상태변경====");
        System.out.println("주방에서 " + order.getMenu() + "을(를) 조리 시작합니다.");
        order.setStatus(OrderStatus_exam.조리_중);
    }

    public void complete(Orderable order) {
        System.out.println("\n===주문상태변경====");
        System.out.println(order.getMenu() + " 조리가 완료되었습니다!");
        order.setStatus(OrderStatus_exam.조리_완료);
    }
}
