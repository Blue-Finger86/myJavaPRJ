import java.util.Scanner;

public class Ex1076 {
    // 영문자 1개 입력, a부터 입력한 문자까지 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 영문자 1개 입력
        char ch = sc.next().charAt(0);

        // a부터 입력한 문자까지 출력
        for(char i = 'a'; i <= ch; i++) {

                System.out.print(i+ " ");

        }
    }
}

//정답!