package Homework01;



import java.util.Random;
import java.util.Scanner;

/*
4단계: 종합 문제 (조건문 + 반복문 + 배열)
학생 5명의 점수를 입력받아 배열에 저장하고,

전체 평균 점수
최고 점수
60점 이상인 학생 수 를 출력하세요.
숫자 맞추기 게임 🎮

1~100 사이의 랜덤 숫자를 하나 정합니다.

사용자가 숫자를 입력하면,

정답보다 크면 "더 작은 수를 입력하세요."
정답보다 작으면 "더 큰 수를 입력하세요."
정답을 맞히면 "정답입니다!"를 출력하고 종료합니다.

로또 번호 생성기 🎲

1부터 45 사이의 숫자 중 중복되지 않게 6개를 랜덤으로 뽑아 배열에 저장하세요.
오름차순으로 정렬하여 출력하세요.

 */
public class Level4 {
    public static void main(String[] args) {
        System.out.println("학생 점수 계산하기");
        StudentScore();

        System.out.println("\n숫자 맞추기 게임");
        NumberGame();

        System.out.println("\n로또 번호 생성기");
        LottoStart();
    }
    public static void StudentScore(){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5]; // 정수 5개 저장할 배열 생성
        int sum = 0;
        int max = 0;
        int over60=0;
        System.out.print("학생 5명의 점수를 공백으로 구분하여 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            scores[i] = sc.nextInt(); // 입력받은 정수를 배열에 저장
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] >= 60) {
                over60+=1;
            }
        }
        System.out.println("학생 점수의 평균값 : "+(double)sum/5);
        System.out.println("학생 점수의 max값 : "+max);
        System.out.println("60점이 넘는 학생 수 : "+over60);
        //sc.nextInt();
        //sc.close();

    }
    public static void NumberGame(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number=rand.nextInt(100)+1;
        int predict=-1;
        System.out.println("게임 시작!");
        boolean gameClear=false;
        while(true){
            System.out.print("숫자를 입력해주세요!(게임을 종료하려면 0을 입력하세요) :");
            predict = sc.nextInt();
            if (predict==0){
                System.out.println("0을 입력하셨습니다. 게임을 종료합니다. ");
                break;
            }
            if(number==predict){
                System.out.println("정답입니다! \n축하합니다. 게임을 종료합니다.");
                break;
            }
            else if(number>predict){
                System.out.println("UP!");

            }
            else{
                System.out.println("DOWN!");
            }
        }
    }

    public static void LottoStart(){
        LottoMachine machine = new LottoMachine();
        machine.GameStart();
    }
}
