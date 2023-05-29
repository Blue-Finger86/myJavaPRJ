import java.util.Scanner;

public class Ex09_07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = ""; //문자열을 저장하는 변수기 때문에

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                str2 += str.charAt(i);
            }
        }
        System.out.println("원 문자열" + str);
        System.out.println("공백 문자열" + str2);
    }
}
