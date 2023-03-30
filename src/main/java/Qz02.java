import java.util.Scanner;

public class Qz02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("정수를 입력해주세요 : ");
        a = s.nextInt();

        if(a == 30) {
            System.out.println("3의 배수와 5의 배수를 둘 다 만족합니다.");
        }

        System.out.printf("정수를 입력해주세요 : ");
        a = s.nextInt();

        if(a == 6) {
            System.out.println("3의 배수입니다.");
        }

        System.out.printf("정수를 입력해주세요 : ");
        a = s.nextInt();

        if(a == 10) {
            System.out.printf("5의 배수입니다.");
        }


    }
}
