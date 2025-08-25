package Homework01;

/*
2단계: 반복문
1부터 100까지의 합을 구하는 프로그램을 작성하세요.
구구단을 출력하는 프로그램을 작성하세요. (2단~9단)
1부터 50까지 수 중에서 3의 배수이면서 5의 배수인 수만 출력하세요.
* */
public class Level2 {
        public static void main(String[] args) {
            System.out.println("1부터 100까지의 합 구하기");
            Sum1toN(100);

            System.out.println("\n구구단 출력하기");
            gugudan();

            System.out.println("\n3과 5의 배수 출력하기");
            find3and5();
    }

    public static void Sum1toN(int n) {//1부터 n까지의 합을 출력하는 함수
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지 합은 " + sum + "입니다.");
    }

    public static void gugudan()//구구단 출력 함수
    {
        System.out.println("구구단 출력 시작====================");
        int[][] gugudan = new int[9][9];
        for (int i = 0; i < 9; i++) {//2차원 배열에 구구단 내용 저장
            for (int j = 0; j < 9; j++) {
                gugudan[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int j = 0; j < 9; j++) {//배열에 저장된 구구단 출력
            for (int i = 0; i < 9; i++) {
                System.out.printf("%d * %d = %d \t", i + 1, j + 1, gugudan[i][j]);
            }
            System.out.println();
        }
        System.out.println("구구단 출력 종료====================");
    }

    public static void find3and5(){//3과 5의 배수 출력함수
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }

}
