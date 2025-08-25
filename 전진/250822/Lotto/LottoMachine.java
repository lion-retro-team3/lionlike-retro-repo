package Day_0822.Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
    static private int[] result={0,0,0,0,0,0};
    static private int maxNum=45;
    static private int minNum=1;
    int nowNum=0;
    private int Pop(){
        Random rand=new Random();
        nowNum = rand.nextInt((maxNum - minNum) + 1) + minNum;
        System.out.println("뽑힌 숫자: " + nowNum);
        return nowNum;
    }
    private boolean isRepeat(int num){
        int[] copyArray=Arrays.copyOf(result,result.length);
        Arrays.sort(copyArray);
        //System.out.println(Arrays.toString(result));
        int index = Arrays.binarySearch(copyArray, num);

        if(index>0)
        {
            System.out.println("번호 중복!!");
            return true;
        }
        else
            return false;
    }
    private void AddWinningNumber(int num,int order){
        result[order]=num;
    }

    public void ViewWinningNumber(){
        Arrays.sort(result);
        System.out.println("당첨 번호 : "+ Arrays.toString(result));
    }

    public void GameStart() {
        int nowball=0;
        for (int i = 0; i < 6; i++) {
            nowball= Pop();
            if (isRepeat(nowball))
            {
                i--;
            }
            else {
                AddWinningNumber(nowball,i);
            }
        }
        ViewWinningNumber();
    }
}
