package Hw1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ICanFindIt {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
// 정수 입력받기
        int[] arr = new int[5];
        // 5개 배열 추가
        try {
            for (int i = 0; i < arr.length; i++){
                arr[i] = scanner.nextInt();
            }
// 입력값 정렬
                Arrays.sort(arr);

// 최솟값 출력
            System.out.println("최솟값은 " + arr[0] + "입니다.");
// 최댓값 출력
            System.out.println("최댓값은 " + arr[4] + "입니다.");
        }
        // 정수가 아닐 경우 출력문
        catch(InputMismatchException e){
                System.out.println("정수만 입력하시오.");
            }

    }
}
