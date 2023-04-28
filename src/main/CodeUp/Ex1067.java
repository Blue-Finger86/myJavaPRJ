import java.util.Scanner;

public class Ex1067 {
    // 정수 1개 입력
    // 첫 줄에 음수인지 양수인지를, 두 번째 줄에 홀수인지 짝수인지를 출력하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //입력한 수를 받을 변수 선언

        if(a > 0) {
            System.out.println("plus");
        } else if(a < 0) {
            System.out.println("minus");
        }

        if(a%2 == 0) {
            System.out.println("even");
        } else if(a%2 != 0) {
            System.out.println("odd");
        }
    }
}

//정답!
