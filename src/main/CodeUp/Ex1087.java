import java.util.Scanner;

public class Ex1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int end = sc.nextInt(); // 내가 입력하는 수를 끝값으로 하겠다
        int sum = 0; // 합 사용할 거니까 변수로 선언 및 생성
        int h = 0;

        for(int i = 0; i < 1000000; i++) {
            sum = sum + i;
            if(sum >= end) {
                h = sum;
                break;
            }
         }
         System.out.print(h);
    }
}


// 정답!