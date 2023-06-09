import java.util.Arrays;
import java.util.Scanner;

//메소드 호출로 배열의 최대값 찾기
class Ex1568_1 {
    //최대값 찾기를 수행할 메소드
    public static int f(int[]a) {
        int[]arr = new int[a.length];  //최대값 담을 변수 max 선언 및 초기화
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {       //값 비교해서 큰 값의 "인덱스"를 변수 max에 넣음(위치)
                    max = j;
                } else {
                    max = i;
                }
            }
        }

        return max+1;  //그리고 +1 해서 위치 반환하기!
    }
}

public class Ex1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //데이터의 총 개수
        int n = sc.nextInt();
        int[]a = new int[n]; //배열 생성

        //총 개수만큼 데이터를 배열에 반복해서 입력
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //최대값 찾기를 실행할 범위(시작과 끝)
        int i = sc.nextInt();
        int j = sc.nextInt();

        int[]cut = Arrays.copyOfRange(a, i, j); //기존 배열에서 부분 배열 생성하기

        System.out.print(Ex1568_1.f(cut));     //부분 배열을 매개변수로 넣어서 메소드 호출

    }
}



//흑흑 내가 원하는대로 못 풀었는데.. 일단 올려(+0609)