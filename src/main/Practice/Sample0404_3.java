import java.util.Scanner;
public class Sample0404_3 {
    //사용자가 원하는 1~9사이의 정수를 입력하여 그 정수를 이용하는 구구단을 출력하시오
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gugudan;

        System.out.print("출력하고 싶은 구구단(1~9사이의 수)을 입력하세요: ");
        gugudan = sc.nextInt();

        for(int i=1; i<10; i++) {
            System.out.printf("%d X %d = %2d\n", gugudan, i, gugudan*i);
        }

    }
}
