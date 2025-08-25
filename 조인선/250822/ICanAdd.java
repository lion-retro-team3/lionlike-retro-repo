package Hw1;

public class ICanAdd {
    public static void main(String[] args) {
        int add = 0;
        // 1부터 100까지 출력
        for(int n = 1; n <= 100; n++ ) {
            add += n;
        }
        System.out.println(add);
    }
}
