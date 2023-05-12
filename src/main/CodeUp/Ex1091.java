import java.util.Scanner;

public class Ex1091 {
    //시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
    //n번째 수를 출력하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작 값
        int m = sc.nextInt(); //곱할 값
        int d = sc.nextInt(); //더할 값
        int n = sc.nextInt(); //마지막 순서를 나타내는 변수

        long[]arr = new long[n]; //배열 생성이 변수 값 입력 뒤에 와야 오류가 안 남

        arr[0] = a;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] * m + d;    //그냥 i-1로 하면 안 됨 1부터 시작이라서 0 곱하기 ~ 돼서 값이 제대로 안 나옴
//            if(i == n-1) {
//                System.out.print(arr[i]);
//            }
        }
            System.out.print(arr[n-1]);
    }
}
