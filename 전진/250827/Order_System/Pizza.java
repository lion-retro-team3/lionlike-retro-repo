package Day_0827.Order_System;

public class Pizza implements Orderable {
    private int price;
    private String menu;
    private OrderStatus_exam status;

    public Pizza(int price, String menu){
        this.price = price;
        this.menu = menu;
        this.status = OrderStatus_exam.주문_접수;
    }
    @Override
    public void order() {
        System.out.println(menu+"피자를 주문했습니다.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getMenu() {
        return menu + " 피자";
    }

    @Override
    public OrderStatus_exam getStatus() {
        System.out.println(this.menu+"라멘은 "+this.status+" 상태입니다.");
        return status;
    }

    @Override
    public void setStatus(OrderStatus_exam status){
        this.status = status;
    }
}
