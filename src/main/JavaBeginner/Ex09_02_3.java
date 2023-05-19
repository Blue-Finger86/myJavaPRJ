import java.util.Scanner;

public class Ex09_02_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열을 입력해 주세요 : ");
        str = s.nextLine();

        System.out.print("출력 문자열 입니다 : ");
        for(int i = 0; i < str.length(); i++) {
            //출력할 건데 조건을 걸어서 바꿔서 출력하고 싶어!
            if(str.charAt(i) == 's') {
                System.out.printf("%c", 'w');
            } else {
                System.out.printf("%c", str.charAt(i));
            }
        }
    }
}
