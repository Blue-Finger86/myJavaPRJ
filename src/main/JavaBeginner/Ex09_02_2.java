import java.util.Scanner;

public class Ex09_02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력:");
        String str = sc.nextLine();

        System.out.print("출력 문자열:");
        for(int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i)+1);    // 헐 1을 더하라는 게 저렇게 더하라는 거였어?!!
        }
    }
}

// 문자에 1을 더하면 알파벳의 다음 문자가 나온다.