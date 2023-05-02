import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Qz0502 {
    //5개의 입력 받는 정수를 큰 순서대로 출력(배열 말고 연결리스트 사용할 것)
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();    // 정수형 값(타입 지정)을 사용할 연결 리스트 생성
        Scanner sc = new Scanner(System.in);             // 직접 입력할 거라서 스캐너 선언

        for(int i = 0; i < 5; i++) {                     //리스트에 값 집어넣는 작업 반복문 사용하여 반복
            list.add(sc.nextInt());                      //메소드 사용하여 리스트에 값 집어 넣기(추가하기), 인덱스를 지정하지 않으면 끝에 추가됨(뒤로 붙음)
        }

        Collections.sort(list, Comparator.reverseOrder());  //내림차순으로 정렬하기


        for(Integer i : list) {                          //반복문 사용해서 리스트 전체 값 출력하기
            System.out.print(i);
            System.out.print(" ");
        }

    }
}


