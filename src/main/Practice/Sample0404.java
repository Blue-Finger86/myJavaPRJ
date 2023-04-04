import java.util.Scanner;
public class Sample0404 {
    //Scanner 클래스를 이용하여 정수를 입력받아 1부터 입력한 숫자까지의 합을 구하는 소스를 코딩(for구문 이용)
    public static void main(String[] args) {

        int num;
        int sum = 0;

        System.out.print("계산할 값을 입력해주세요:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1; i<=num; i++) {  // 위에서 i를 따로 선언 안 하고 초기값에 int i=1; 이렇게 넣어도 됨
            sum = sum + i;
        }
        System.out.printf("1부터 %d까지의 합은 %d", num, sum);
    }
}
