import java.util.Scanner;
public class Ex08_03_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[]aa = new int[4];
        int hap = 0, i;     // 합을 담을 변수와 첨자 변수 선언

        for(i=0; i<4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요:", i+1);  // 입력하세요 출력문 4번 반복
            aa[i] = s.nextInt(); // 숫자를 직접 입력하는 구문도 4번 반복
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계==>%d\n", hap);
    }
}
