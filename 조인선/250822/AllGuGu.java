package Hw1;
public class AllGuGu {
    public static void main(String[] args) {
        // 곱하는 수가 늘어남
            for (int j = 1; j < 10; j++) {
         // 단 수가 늘어남
                for (int i = 2; i < 10; i++) {
                int gugu = i * j;

                // 구구단 출력
                System.out.print(i + " * " + j + " =" + gugu + "\t");

                }
                // 줄바꿈으로 정렬
                System.out.println();
        }

    }
}
