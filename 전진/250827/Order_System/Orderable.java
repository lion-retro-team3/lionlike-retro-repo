package Day_0827.Order_System;

public interface Orderable {

    void order();
    int getPrice();
    //void deliver();

    String getMenu();
    OrderStatus_exam getStatus();    // 현재 상태 확인
    void setStatus(OrderStatus_exam status);  // 상태 변경
}
