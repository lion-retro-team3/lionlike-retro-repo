package Day_0822;

import java.util.Random;

public class Dice {
    //어떤 속성이 필요할까요??
    //속성 - 면, 눈
    int face=6;
    int eye;

    //기능 - 던지기, 굴리기.

    public void NR_Roll(){
        //주사위의 면의 따라서 랜덤한 값을 하나 발생하게함.
        Random random = new Random();

        //0.0 ~  1.0 사이의 값이 리턴된. 1.0 은 포함되지 않는다.
        eye = (int)(Math.random()*face)+1;

        System.out.println(eye);
    }

    private void setFace(int face){
        this.face=face;
    }

    public int Roll(){
        //주사위의 면의 따라서 랜덤한 값을 하나 발생하게함.
        Random random = new Random();

        //0.0 ~  1.0 사이의 값이 리턴된. 1.0 은 포함되지 않는다.
        eye = (int)(Math.random()*face)+1;

        //System.out.println(eye);
        return eye;
    }

    public void MultiRoll(int rollnum){
        int[] faceArray = new int[face+1]; // 주사위 눈의 개수 + 1 크기 배열
        int noweye = 0;

        for (int i = 0; i < rollnum; i++) {
            noweye = Roll();          // 주사위 굴림 결과 (1 ~ face라고 가정)
            faceArray[noweye]++;      // 해당 눈의 횟수 증가
        }

        // 출력: 1번 인덱스부터 face까지
        for (int i = 1; i <= face; i++) {
            System.out.println(i + "의 횟수: " + faceArray[i]);
        }
    }
    public static void main(String[] args) {
        //MultiRoll(1);
        Dice dice = new Dice();
        //dice.roll();
        dice.MultiRoll(120);
        DiceUser diceUser = new DiceUser();
        diceUser.DiceTest(dice,2);
    }

}