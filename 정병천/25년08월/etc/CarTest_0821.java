

// Car 라는 클래스(설계도)를 정의
class Car {
    // 속성 (필드)
    String color;
    int speed;

    // 기능 (메서드)
    public void drive() {
        System.out.printf("%dKm/h의 %s색 차가 달립니다.", speed, color);
    }
}

public class CarTest_0821 {
    public static void main(String[] args) {

        // 인스턴스 생성 ( = 객체 )
        Car myCar = new Car();

        // 참조 변수를 통해 인스턴스의 필드 설정과 메서드 사용.
        myCar.color = "빨강";
        myCar.speed = 100;
        myCar.drive(); // "...달립니다." 출력

    }
}
