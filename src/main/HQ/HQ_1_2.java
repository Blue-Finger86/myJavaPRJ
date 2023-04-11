import java.util.Scanner;
public class HQ_1_2 {
    public static void main(String[] args) {
        //콘솔창에서 값을 입력받는 객체 Scanner 선언
        Scanner s = new Scanner(System.in);
        //최댓값의 인덱스와 최댓값을 저장할 변수 answer, max 선언
        byte max, maxIdx=0;
        //입력될 9개의 서로 다른 자연수를 저장할 배열 선언
        byte[] arr = new byte[9];

        //9개의 수를 입력받아 순서대로 배열에 저장
        for (byte i = 0; i < arr.length; i++) {
            arr[i] = s.nextByte();
        }

        //배열의 최댓값을 저장할 max
        max = arr[0];
        for (byte i = 0; i < arr.length; i++) {
            //max의 값과 모든 원소들의 값을 비교하여 더 큰 수를 만나면 max에 저장
            if (max > arr[i]) {
                max = arr[i];
                //결국 현시점의 최댓값이 max에 저장되므로 이때 최댓값의 인덱스 번호는 i+1임
                maxIdx = (byte)(i + 1);
            }

        }
        //반복문의 실행이 끝나면 모든 원소들과 비교한 최댓값, 최댓값 인덱스 출력
        System.out.println(max);
        System.out.println(maxIdx);
    }
}

