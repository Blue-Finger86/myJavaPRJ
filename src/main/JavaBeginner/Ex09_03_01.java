import java.util.Scanner;

public class Ex09_03_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열을 입력해주세요:");
        str = s.nextLine();

        System.out.print("문자열을 출력하겠습니다:");
        if(!str.startsWith("(")) {
            System.out.print("(");
        }

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        if(!str.endsWith(")")) {
            System.out.print(")");
        }
    }
}
