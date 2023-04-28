import java.util.Scanner;

public class Ex1077 {
    // 정수 1개 입력, 0부터 내가 입력한 수까지 줄 바꿔가며 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }
}


// 정답!