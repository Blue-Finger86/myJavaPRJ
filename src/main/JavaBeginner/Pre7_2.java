import java.util.Scanner;
public class Pre7_2 {
    // 값을 직접 입력해서 합을 구하는 프로그램을 while의 무한루프로 짜보기
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while(true) {
            System.out.printf("더할 첫 번째 수 입력: ");
            a = sc.nextInt();
            System.out.printf("더할 두 번째 수 입력: ");
            b = sc.nextInt();
            System.out.printf("%d + %d = %d\n", a, b, a+b);
        }
    }
}
