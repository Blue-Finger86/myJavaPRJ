import java.util.Scanner;

public class Ex1074 {
    // 정수 1개 입력, 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력(카운트 다운)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   //내가 입력할 수 담을 변수 a 선언 및 생성

        for(int i = 0; i <= a; i++) {    // 초기값에 a가 들어가서는 안 됨. 이 반복문은 행위의 횟수를 나타내고 있으니까 시작값은 당연히 첫번째를 나타내는 0이어야 함.
            System.out.println(a-i);     // 반복해서 실행할 작업 -> 출력(a-i인 이유 i가 커지면서 최종 결과값은 점점 줄어드니까 카운트다운이 가능해짐)

            if((a-i) == 1) {             // 0아니고 1까지만 출력할 거니까 a-i가 1이랑 같아졌을 때 반복문 나와야 함.
                break;
            }
        }
    }
}
