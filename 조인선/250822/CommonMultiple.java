package Hw1;

public class CommonMultiple {
    public static void main(String[] args) {
        int i = 3;
        int j = 5;
        // 들을 곱한 값이 최소공배수
        // 50이하까지 공배수 반복
        for(int k = i * j; k < 50; k += i * j)
        {
// 최소공배수 출력
            System.out.println(k);
        }

    }
}
