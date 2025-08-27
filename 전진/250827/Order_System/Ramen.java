package Day_0827.Order_System;

public class Ramen implements Orderable {
    private int price;
    private String menu;
    private OrderStatus_exam status;

    public Ramen(int price, String menu){
        this.price = price;
        this.menu = menu;
        this.status= OrderStatus_exam.주문_접수;
    }

    @Override
    public void order() {
        System.out.println(menu+"라멘을 주문하셨습니다.");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public String getMenu() {
        return menu + " 라멘";
    }

    @Override
    public OrderStatus_exam getStatus() {
        System.out.println(this.menu+"피자는 "+this.status+" 상태입니다.");
        return status;
    }

    @Override
    public void setStatus(OrderStatus_exam status){
        this.status = status;
    }
}
