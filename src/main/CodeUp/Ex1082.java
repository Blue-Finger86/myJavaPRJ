import java.util.Scanner;

public class Ex1082 {
    //16진수 구구단
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 16진수로 한 자리 수를 입력할 건데, A~F까지만 입력할 것(10~16)

        for (int i = 1; i < 17; i++) {
            System.out.printf("%x X %x = %x\n", a, i, a * i);
        }
    }
}