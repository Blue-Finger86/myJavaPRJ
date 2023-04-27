import java.util.Scanner;

public class Ex1079 {
    // 문자들이 1개씩 계속해서 입력, 특정 문자가 입력될 때까지 한 줄씩 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //입력할 거니까 스캐너먼저 선언

        // 문자 하나씩 계속 입력
        int i = 0;
        while(true) {
            char ch = sc.next().charAt(0);

            System.out.println(ch);

            if(ch=='q') {
                break;
            }
        }
    }
}


//정답!