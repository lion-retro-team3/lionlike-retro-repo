package Mini_Project;

import Mini_Project.Restaurant.Restaurant_Info;
import Mini_Project.Restaurant.Menu_Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<OrderItem> orderList = new ArrayList<>();
    public void addOrder(Menu_Item menuItem, Restaurant_Info restaurantInfo) {
        //System.out.println("체크포인트2");
        OrderItem orderItem=new OrderItem(restaurantInfo.getRestaurant_name(),menuItem.getName(),menuItem.getPrice());
        orderList.add(orderItem);
    }
    public void printAllOrders(){
        int sumprice=0;
        if(orderList.isEmpty()){
            System.out.println("현재 주문한 음식이 없습니다.");
        }
        else {
            System.out.println("=====전체 주문 목록=====");
            for(OrderItem orderItem:orderList){
                System.out.println(orderItem.toString());
                sumprice+=orderItem.getPrice();
            }
            System.out.println("\n총 주문 금액 : "+sumprice);
        }
    }
    //public void
}
