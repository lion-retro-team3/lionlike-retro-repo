package Homework01;
import java.util.Scanner;
/*
1단계: 변수와 조건문
사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
세 개의 정수를 입력받아 그 중 가장 큰 수를 출력하세요.

참고한 자료
여러개의 정수 입력받기 - https://art-coding3.tistory.com/28
자바 정수 최대최솟값 불러오기 - https://hianna.tistory.com/583

*/
public class Level1 {
    //짝수 홀수 판별 함수
    public static void evenORodd(int onenum){
        if(onenum%2==0){//2로 나눠지면 짝수
            System.out.println(onenum+"은(는) 짝수입니다.");

        }
        else{
            System.out.println(onenum+"은(는) 홀수입니다.");
        }
    }
    //가장 큰 수를 출력하는 함수
    public static void findMax(int first, int second, int third){
        int max = Integer.MIN_VALUE;//정수범위 최소값을 초기값으로 설정

        //3개의 수 중 가장 큰 수 찾아서 max에 입력
        if(first>=second && first>=third){
            max = first;
        }
        else if(second>=first && second>=third){
            max = second;
        }
        else if(third>=first && third>=second){
            max = third;
        }
        System.out.print("입력한 3개의 수 중에 가장 큰 수는 "+max+"입니다.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//스캐너 설정

        //onenum에 수 입력받고 evenOrodd함수에 인수로 전달
        System.out.print("짝수인지 홀수인지 판별할 정수를 입력하세요 : ");
        int onenum = sc.nextInt();
        evenORodd(onenum);

        //3개의 수 입력받고 findMax함수에 인수로 전달
        System.out.print("정수 3개를 공백으로 구분하여 입력하세요 :");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        findMax(first,second,third);

    }
}

