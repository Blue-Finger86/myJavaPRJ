import java.util.Scanner;
public class Qz_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("값을 입력해주세요 : ");
        int a = sc.nextInt();

        if ( a%6 == 0 ) {
            System.out.print("2의 배수와 3의 배수를 만족합니다.");
        } else if ( a%2 == 0 ) {
            System.out.print("2의 배수입니다.");
        } else if ( a%3 == 0 ) {
            System.out.print("3의 배수입니다.");
            }
        }
}

