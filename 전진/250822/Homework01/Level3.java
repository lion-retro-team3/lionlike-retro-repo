package Homework01;
import java.util.Scanner;
import java.util.Arrays;
/*
* 3단계: 배열
정수 5개를 입력받아 배열에 저장한 후, 최대값과 최소값을 출력하세요.
문자열 배열에 "사과", "바나나", "딸기", "포도"를 저장하고, 사용자로부터 과일 이름을 입력받아 배열 안에 존재하는지 찾는 프로그램을 작성하세요.
* */
public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // 정수 5개 저장할 배열 생성
        System.out.print("정수 5개를 공백으로 구분하여 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt(); // 입력받은 정수를 배열에 저장
        }
        findMinandMax(numbers);
        System.out.print("검색할 과일 이름을 입력하세요 : ");
        String Fruit = sc.next();
        SearchFruit(Fruit);
    }
    //배열안에서 최대 최솟값 찾는 함수
    public static void findMinandMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            else if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("입력한 수 중에 최소값은 "+ min+ "이고 최대값은 "+max+"입니다.");
    }
    //과일 검색 함수
    public static void SearchFruit(String fruit) {
        String[] FruitList = {"사과", "바나나", "딸기", "포도"};
        System.out.println(Arrays.toString(FruitList));
        if (isExist(FruitList, fruit)) {
            System.out.println("입력하신 과일이 배열 안에 존재합니다.");
        }
        else{
            System.out.println("입력하신 과일이 배열 안에 존재하지 않습니다.");
        }
    }
    //배열 안에 과일 이름이 있는지 판별하는 boolean 함수
    public static boolean isExist(String[] FruitList, String fruit) {
        for (int i = 0; i < FruitList.length; i++) {
            if (FruitList[i].equals(fruit)) {
                return true;
            }
        }
        return false;
    }
}
