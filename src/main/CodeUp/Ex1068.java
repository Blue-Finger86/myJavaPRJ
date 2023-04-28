import java.util.Scanner;

public class Ex1068 {
    // 정수 1개 입력 후 해당하는 평가 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;

        if (a >= 90) {
            b = 1;
        } else if (a >= 70) {
            b = 2;
        } else if (a >= 40) {
            b = 3;
        } else if (a <= 39) {
            b = 4;
        }

        switch (b) {
            case 1:
            System.out.println("A");
            break;

            case 2:
            System.out.println("B");
            break;

            case 3:
            System.out.println("C");
            break;

            case 4:
            System.out.println("D");
            break;
        }
    }
}


//정답!